public class Vendedor{
    private String cedula;
	private String nombres;
	

	public Vendedor(String cedula, String nombres){
		this.cedula = cedula;
		this.nombres = nombres;
		
	}

	public String getCedula(){
		return this.cedula;
	}

	public String getNombres(){
		return this.nombres;
	}
}