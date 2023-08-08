let waitContent = null;
let contentClients = null;
let formInsertarUsuario = null;
let formEditarUsuario = null;
let formEliminarUsuario = null;
let modalModificarUsuario = null;
let modalEliminarUsuario = null;
let listaClientes = null;

window.onload = function(){
	waitContent = document.getElementById("waitContent");
	contentClients = document.getElementById("contentClients");
	formInsertarUsuario = document.getElementById("formInsertarUsuario");
	formEditarUsuario = document.getElementById("formEditarUsuario");
	formEliminarUsuario = document.getElementById("formEliminarUsuario");
	campo_cedula = document.getElementById("campo_cedula");
	
	options = {
				backdrop: 'static',
  				keyboard: false,
  				focus: false
  			  };
			  
	modalModificarUsuario = new bootstrap.Modal(document.getElementById('modalModificarUsuario'), options);
	modalEliminarUsuario = new bootstrap.Modal(document.getElementById('modalEliminarUsuario'), options);

	formInsertarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		crearCliente();
	});
	formEditarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		editarCliente();
	});
	formEliminarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		eliminarCliente();
	});

	getClientes();
}


// FORMATO JSON - PARA ELIMINAR USUARIOS
function eliminarCliente(){
	let datos = new FormData(formEliminarUsuario);
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};
	fetch("http://localhost/24-APIenPHP/ProyectoPHP/Eliminar.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {
		// console.log(" Respuesta API: ");
		// console.log(data);
		if(data.respuesta.status){
			getClientes();
			Swal.fire({
				icon: 'success',
				title: 'USUARIO BORRADO DE LA BASE DE DATOS',
				text: 'los datos fueron borrados de la base de datos',
			});
		}else{
			Swal.fire({
				icon: 'error',
				title: 'LOS DATOS NO SE ELIMINARON',
				text: 'los datos no se eliminaron, no se encuentran los datos',
			});
		}
	});
}

// FORMATO JSON - PARA EDITAR USUARIO
function editarCliente(){
	let datos = new FormData(formEditarUsuario);
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};
	fetch("http://localhost/24-APIenPHP/ProyectoPHP/Modificar.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {
		// console.log(" Respuesta API: ");
		// console.log(data);
		if(data.respuesta.status){
			getClientes();
			Swal.fire({
				icon: 'success',
				title: 'DATOS MODIFICADOS',
				text: 'los datos se modificaron Correctamente',
			});
		}else{
			Swal.fire({
				icon: 'error',
				title: 'LOS DATOS NO SE MODIFICARON',
				text: 'los datos no se modificaron, datos mal ingresados',
			});
		}
	});
}

// FORMATO JSON - PARA CREAR USUARIOS

function crearCliente(){
	let datos = new FormData(formInsertarUsuario);
	
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};

	fetch("http://localhost/24-APIenPHP/ProyectoPHP/Insert.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {

		// console.log(" Respuesta API: ");
		// console.log(data);

		if(data.respuesta.status){
			document.getElementById("campo_cedula").value ="";
			document.getElementById("campo_nombres").value ="";
			document.getElementById("campo_apellidos").value ="";
			document.getElementById("campo_telefono").value ="";
			document.getElementById("campo_direccion").value ="";
			document.getElementById("campo_correo").value ="";
			
			document.getElementById("campo_cedula").focus();

			Swal.fire({
				icon: 'success',
				title: 'INSERTADO CON EXITO',
				text: 'El usuario ha sido creado con exito',
			});

		}else{
			
			Swal.fire({
				icon: 'error',
				title: 'NO INSERTADO ',
				text: 'No se pudo crear el ususario, Es posible que la cedula no exista',
			});

			
		}

	});
}


//LISTA DE USUARIOS REGISTRADOS 

function getClientes(){
	let endpointLocal = "http://localhost/24-APIenPHP/ProyectoPHP/Obtener.php";
	waitContent.style.display = 'block';
	fetch( endpointLocal )
	.then( res => res.json() )
	.then( data => {
		// console.log("Datos servidor:");
		// console.log(data);
		listaClientes = data.registros;
		contentClients.innerHTML = "";
		for (var i = 0; i < data.registros.length; i++) {
			let trHtlm = `	<tr> 
								<td class="text-center"> ${ data.registros[i].cedula } </td>
								<td> ${ data.registros[i].nombres } </td>
								<td> ${ data.registros[i].apellidos } </td>
								<td class="text-center"> ${ data.registros[i].telefono } </td>
								<td> ${ data.registros[i].direccion } </td>
								<td> ${ data.registros[i].correo } </td>
								<td class="m-0 p-1">
									<button class="col-12 btn btn-outline-success m-0 px-2 py-1" onclick="abrirModalAbrirEditar(${i})"> EDITAR </button>
								</td>
								<td class="m-0 p-1">
									<button class="col-12 btn btn-outline-success m-0 px-2 py-1" onclick="abrirModalAbrirEliminar(${i})"> ELIMINAR </button>
								</td>
							</tr>`;
			contentClients.innerHTML += trHtlm;
		}

		waitContent.style.display = 'none';
	});	
}


// ABRIR MODAL EDITAR

function abrirModalAbrirEditar(posicion) {
	document.getElementById("modificar_campo_cedula").value = listaClientes[posicion].cedula;
	document.getElementById("modificar_campo_nombres").value = listaClientes[posicion].nombres;
	document.getElementById("modificar_campo_apellidos").value = listaClientes[posicion].apellidos;
	document.getElementById("modificar_campo_telefono").value = listaClientes[posicion].telefono;
	document.getElementById("modificar_campo_direccion").value = listaClientes[posicion].direccion;
	document.getElementById("modificar_campo_correo").value = listaClientes[posicion].correo;
	
	modalModificarUsuario.show();
}
// ABRIR MODAL PARA ELIMINAR

function abrirModalAbrirEliminar(posicion) {
	document.getElementById("eliminar_campo_cedula").value = listaClientes[posicion].cedula;
	modalEliminarUsuario.show();
}