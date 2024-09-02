package cl.desafioLatam.utilidades;

public enum ListaEstado {

	LISTA_CON_DATOS ("La lista Coniene Datos."),
	LISTA_SIN_DATOS("No existen datos."),
	LISTA_NULL("La lista esta Nula.");

	private final String mensaje;
	
	ListaEstado(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	public String getMensaje() {
		return mensaje;
	}
	
	
}
