<?php
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
    header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

    if (!empty($_POST['cedula'])){

        $cedula = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $telefono = $_POST['telefono'];
        $direccion = $_POST['direccion'];
        $correo = $_POST['correo'];

        $conexion = $base_de_datos->prepare("DELETE FROM personas WHERE cedula=:cedula");
        $conexion->bindParam(':cedula', $cedula);

        $proceso = $conexion->execute();

        if( $proceso ){
            $respuesta['respuesta'] = [
                                        'status' => true,
                                        'message' => "OK##Cliente##Eliminar",
                                      ];
            echo json_encode($respuesta);
        }else{
            $respuesta['respuesta'] = [
                                        'status' => false,
                                        'message' => "ERROR##Cliente##Eliminar",
                                      ];
            echo json_encode($respuesta);
        }

    }else{
        $respuesta['respuesta'] = [
                                    'status' => false,
                                    'message' => "ERROR##DATOS##POST",
                                    'request' => $_POST
                                  ];
        echo json_encode($respuesta);
    }
?>
