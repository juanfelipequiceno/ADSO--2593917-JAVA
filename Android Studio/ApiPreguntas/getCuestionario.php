<?php
    include "Conexion.php";

    if(!empty($_POST["id_usuario"])  || !empty($_GET["id_usuario"])){
        $id_usuario = (!empty($_POST["id_usuario"]))? $_POST["id_usuario"] : $_GET["id_usuario"];

        $consulta = $base_de_datos->prepare("SELECT * FROM cuestionarios WHERE $id_usuario = id_usuario ");
        $consulta->execute();
        $datos = $consulta->fetchALL(PDO::FETCH_ASSOC);
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");
        if ($datos) {
            $respuesta = [
                "status" => true,
                "message" => "USER##FOND",
                "cuestionario"=> $datos
            ];
            echo json_encode($respuesta);
        }else {
            $respuesta = [
                "status" =>false,
                "message" => "USER##NOT##FOUND"
            ];
            echo json_encode($respuesta);
        }


    }else{
        $respuesta = [
            "status" => false,
            "message" => "ERROR##DATA"
        ];
        echo json_encode($respuesta);
    }
?>