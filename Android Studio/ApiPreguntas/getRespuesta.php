<?php
include "Conexion.php";
if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"])) {
    $idCuestionario = (!empty($_POST["id_cuestionario"])) ? $_POST["id_cuestionario"] : $_GET["id_cuestionario"];

    try {
        $consulta = $base_de_datos->prepare("SELECT * FROM respuestas WHERE id_cuestionario = :id ");
        $consulta->bindParam(":id", $idCuestionario);

        $consulta->execute();
        $datos =  $consulta->fetchAll(PDO::FETCH_ASSOC);
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");
        $consultaRespuestas = $base_de_datos->prepare("SELECT id_pregunta FROM respuestas WHERE id_cuestionario = :id_cuestionario");
        $consultaRespuestas->bindParam(":id_cuestionario", $idCuestionario, PDO::PARAM_INT);
        $consultaRespuestas->execute();
        $idPreguntas = $consultaRespuestas->fetchAll(PDO::FETCH_COLUMN);
        $consultaPreguntas = $base_de_datos->prepare(" SELECT preguntas.*, respuestas.estado, respuestas.respuesta, opciones.id AS respuesta FROM preguntas  INNER JOIN respuestas ON preguntas.id = respuestas.id_pregunta INNER JOIN opciones ON respuestas.respuesta = opciones.descripcion WHERE preguntas.id = :id_pregunta");


        $respuestasPregunta = [];
        $opcionesObjetos=[];
        $datosObjetos = [];

        foreach ($idPreguntas as $idPregunta) {
           
            $consultaPreguntas->bindParam(":id_pregunta", $idPregunta, PDO::PARAM_INT);
            $consultaPreguntas->execute();

          
            $pregunta = $consultaPreguntas->fetch(PDO::FETCH_ASSOC);

            if ($pregunta) {
                $consultaOpciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :id_pregunta2");
                $consultaOpciones->bindParam(":id_pregunta2", $idPregunta, PDO::PARAM_INT);
                $consultaOpciones->execute();

                $opcionesResultados = $consulta_opciones->fetchAll(PDO::FETCH_ASSOC);

                $opciones_objetos = [];

                foreach ($opcionesResultados as $opcionResultado) {
                    $opcionObjeto = (object) $opcionResultado; 
                    $opcionesObjetos[] = $opcionObjeto;
                }
              
                $respuestasPregunta = [
                    "pregunta" => $pregunta,
                    "opciones" => $opcionesObjetos
                ];


                $objetoRespuestaPregunta = (object) $respuestasPregunta;
                $datosObjetos[] = $objetoRespuestaPregunta;
            }
        }
        $datos = $datosObjetos;
        if (!empty($respuestasPregunta)) {
            echo json_encode([
                "status" => true,
                "message" => "DATA##OK",
                "respuestas" => $datos
            ]);
        } else {
            echo json_encode([
                "status" => false,
                "message" => "No se encontraron preguntas para el cuestionario dado"
            ]);
        }
    } catch (PDOException $e) {
        // Manejar cualquier excepción de PDO
        echo json_encode([
            "status" => false,
            "message" => "Error en la consulta: " . $e->getMessage()
        ]);
    }
}else {
    $respuesta = [
                    "status" => false,
                    "message" => "ERROR##DATOS##POST"

                ];

    echo json_encode($respuesta);
}
?>