import java.util.ArrayList;
import java.util.List;

import cl.desafioLatam.DAO.ProveedorDAO;
import cl.desafioLatam.DTO.ProveedorDTO;
import cl.desafioLatam.servicios.ServicioProveedorDAO;
import cl.desafioLatam.utilidades.ListaEstado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Testing NuevoProveedor DAO
		
		/*
		ServicioProveedorDAO sp = new ServicioProveedorDAO();
		
		ProveedorDTO proveedorTst1 = null;
		ProveedorDTO proveedorTst2 = new ProveedorDTO(0, "", "12312","asdsa", "asdasd@asdsa", "231214", "123123", "3123123123");
		ProveedorDTO proveedorTst3 = new ProveedorDTO(0, "", "", "", "", "", "", "");
		ProveedorDTO proveedorTst4 = new ProveedorDTO(0, null, null, null, null, null, null, null);
		ProveedorDTO proveedorTst5 = new ProveedorDTO(0, "asd", "12312","asdsa", "asdasd@asdsa", "231214", "123123", "3123123123");
		
		System.out.println(sp.nuevoProveedor(proveedorTst5));
		
		*/
		
		
		/*
		// Testing listaProveedores
		
		ServicioProveedorDAO sp = new ServicioProveedorDAO();
		List<ProveedorDTO> proveedores = new ArrayList<>();
		
		ListaEstado estado = sp.listaProveedores(proveedores);
		System.out.println(estado.getMensaje());
		
		for(ProveedorDTO proveedor : proveedores) {
			System.out.println(proveedor.getNombre() +": " + proveedor.getRut());
		}
		
		System.out.println(proveedores.size());
		
		*/
	}

}
