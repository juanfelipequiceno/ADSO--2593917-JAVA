<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['cedula']) and !empty($_POST['nombres']) and !empty($_POST['apellidos']) and !empty($_POST['telefono']) and !empty($_POST['direccion']) and !empty($_POST['correo'])) {

        $documento = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $telefono = $_POST['telefono'];
        $direccion = $_POST['direccion'];
        $correo = $_POST['correo'];

        $consulta = $base_de_datos->prepare("INSERT INTO personas(cedula, nombres, apellidos, telefono, direccion, correo) VALUES(:doc, :nom, :ape, :tel, :dir, :cor) ");

        $consulta->bindParam(':doc', $documento);
        $consulta->bindParam(':nom', $nombres);
        $consulta->bindParam(':ape', $apellidos);
        $consulta->bindParam(':tel', $telefono);
        $consulta->bindParam(':dir', $direccion);
        $consulta->bindParam(':cor', $correo);
        
        $proceso = $consulta->execute();

        if( $proceso ){
            $respuesta['respuesta'] = [
                                        'status' => true,
                                        'mesagge' => "OK##Cliente##Insert",
                                      ];
            echo json_encode($respuesta);
        }else{
            $respuesta['respuesta'] = [
                                        'status' => false,
                                        'mesagge' => "ERROR##Cliente##Insert",
                                      ];
            echo json_encode($respuesta);
        }
        
    }else{
        $respuesta['respuesta'] = [
                                    'status' => false,
                                    'mesagge' => "ERROR##DATOS##POST",
                                    'request' => $_POST
                                  ];
        echo json_encode($respuesta);
    }
?>
