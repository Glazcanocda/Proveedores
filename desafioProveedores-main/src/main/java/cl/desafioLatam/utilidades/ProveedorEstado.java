package cl.desafioLatam.utilidades;

public enum ProveedorEstado {
	PROVEEDOR_CON_DATOS ("El proveedor Coniene Datos. Se han agregado los datos"),
	PROVEEDOR_SIN_DATOS("Los datos no se han agregado correctamente."),
	PROVEEDOR_NULL("Proveedor se encuentra Nulo.");

	private final String mensaje;
	
	ProveedorEstado(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	public String getMensaje() {
		return mensaje;
	}
}
