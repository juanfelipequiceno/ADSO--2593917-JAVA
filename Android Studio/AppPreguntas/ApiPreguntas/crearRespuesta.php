

<?php
include "Conexion.php";

if (!empty($_POST["id_cuestionario"])  && !empty($_POST["id_pregunta"]) && !empty($_POST["respuesta"]) && !empty($_POST["estado"]) && !empty($_POST["fecha"]) ){
    $idCuestionario =  $_POST["id_cuestionario"];
    $idPregunta  = $_POST["id_pregunta"];
    $respuesta = $_POST["respuesta"];
    $estado = $_POST["estado"];
    $fecha = $_POST["fecha"];

    try {
        $consulta = $base_de_datos->prepare("INSERT INTO respuestas (id_cuestionario, id_pregunta, respuesta, estado, fecha) VALUES(:idc, :idp, :res, :est, :fec) ");

        $consulta->bindParam(':idc', $idCuestionario);
        $consulta->bindParam(':idp', $idPregunta);
        $consulta->bindParam(':res', $respuesta);
        $consulta->bindParam(':est', $estado);
        $consulta->bindParam(':fec', $fecha);
        
        $proceso = $consulta->execute();
        
        if( $proceso ){
            $resultado = [
                            'status' => true,
                            'mesagge' => "OK##RESPUESTA##INSERT"
                            ];
            echo json_encode($resultado);
        }else{
            $resultado = [
                            'status' => false,
                            'mesagge' => "ERROR##RESPUESTA##INSERT"
                            ];
            echo json_encode($resultado);
        }
    } catch (Exception $e) {
        $resultado = [
                        'status' => false,
                        'mesagge' => "ERROR##SQL",
                        'exception' => $e
                      ];
        echo json_encode($resultado);
    }
}

?>