<?php
include "Conexion.php";

if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"])){
    $idCuestionario = (!empty($_POST["id_cuestionario"])) ? $_POST["id_cuestionario"] : $_GET["id_cuestionario"];

    try {
        $consultaPregunta = $base_de_datos->prepare("SELECT preguntas.* FROM preguntas WHERE preguntas.id NOT IN (SELECT respuestas.id_pregunta FROM respuestas WHERE id_cuestionario = :idc)");
        
        $consultaPregunta->bindParam(":idc", $idCuestionario);
        $consultaPregunta->execute();
        $preguntas =  $consultaPregunta->fetchAll(PDO::FETCH_ASSOC);
        $posicion = random_int(0 , sizeof($preguntas)-1);
        $pregunta = $preguntas[$posicion];

        $consultaOpciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :idp");
        $consultaOpciones->bindParam(":idp", $pregunta['id'] );
        $consultaOpciones->execute();
        $opcionesResultados = $consultaOpciones->fetchAll(PDO::FETCH_ASSOC);
        

        if ($pregunta) {
            $respuesta = [
                "status" => true,
                "message" => "DATA##OK",
                "cant_preguntas" => sizeof($preguntas),
                "preguntas" => $pregunta,
                "opciones" => $opcionesResultados
            ];

            echo json_encode($respuesta);
        } else {
            echo json_encode([
                "status" => false,
                "message" => "No se encontraron preguntas en la base de datos"
            ]);
        }
    } catch (PDOException $e) {
        // Manejar cualquier excepción de PDO
        echo json_encode([
            "status" => false,
            "message" => "Error en la consulta: " . $e->getMessage()
        ]);
    }
    
    
}

?>