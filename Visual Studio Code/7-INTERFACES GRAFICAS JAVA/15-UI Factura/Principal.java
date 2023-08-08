public class Principal{
	public static void main(String[] args) {
		
		Persona listaClientes[] = new Persona [100];
		Vendedor listaVendedores[] = new Vendedor [10];
		
		listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18");
		listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17");
		listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16");


		listaVendedores[0] = new Vendedor("122509", "Felipe quiceno");
		listaVendedores[1] = new Vendedor("122510", "Oscar Loaiza");
		listaVendedores[2] = new Vendedor("122511", "Juan Lopez");
		listaVendedores[3] = new Vendedor("122512", "Catalina Mendez");
		listaVendedores[4] = new Vendedor("122513", "Andres lopez");



		Facturador inicio = new Facturador(listaClientes, listaVendedores);

	}
}