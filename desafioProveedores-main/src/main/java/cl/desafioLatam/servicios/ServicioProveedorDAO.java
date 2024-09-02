package cl.desafioLatam.servicios;

import java.util.List;

import cl.desafioLatam.DAO.ProveedorDAO;
import cl.desafioLatam.DTO.ProveedorDTO;
import cl.desafioLatam.utilidades.ListaEstado;
import cl.desafioLatam.utilidades.ProveedorEstado;

public class ServicioProveedorDAO {

	private static ProveedorDAO proveedorDao = new ProveedorDAO();

	public ProveedorEstado nuevoProveedor(ProveedorDTO nuevoProveedor) {
		
		System.out.println(nuevoProveedor);

		if (nuevoProveedor != null ) {
			
			boolean proveedorEmpty = proveedorEmpty(nuevoProveedor);
			
			if(proveedorEmpty == false) {
				Integer respuesta = proveedorDao.insertProveedor(nuevoProveedor);
				if (respuesta == 1) {
					return ProveedorEstado.PROVEEDOR_CON_DATOS;
				}else if(respuesta == 0) {
					return ProveedorEstado.PROVEEDOR_NULL;
				}
			}else {
				return ProveedorEstado.PROVEEDOR_SIN_DATOS;
			}
			
		} 
		return ProveedorEstado.PROVEEDOR_NULL;
		
		

		

	}

	
	public ListaEstado listaProveedores(List<ProveedorDTO> proveedoresEntrada) {
		List <ProveedorDTO>proveedoresBBDD = proveedorDao.listarProveedores();

		if (proveedoresBBDD == null) {
			return ListaEstado.LISTA_NULL;
		}

		if (proveedoresBBDD.isEmpty()) {
			return ListaEstado.LISTA_SIN_DATOS;
		} else {
			proveedoresEntrada.clear();
			proveedoresEntrada.addAll(proveedoresBBDD);
			return ListaEstado.LISTA_CON_DATOS;

		}

	}

	public boolean proveedorEmpty(ProveedorDTO proveedor) {

		
		if (proveedor.getNombre().equals("") || proveedor.getRut().equals("") || proveedor.getCorreo().equals("")
				|| proveedor.getDireccion().equals("") || proveedor.getTelefono().equals("")
				|| proveedor.getContacto().equals("") || proveedor.getTelefonoContacto().equals("")) {

			return true;

		} else {
			return false;
		}
	}

}
