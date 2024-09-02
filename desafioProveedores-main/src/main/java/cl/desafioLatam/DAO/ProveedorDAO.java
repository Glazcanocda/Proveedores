package cl.desafioLatam.DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.desafioLatam.DTO.ProveedorDTO;
import cl.desafioLatam.conectionDDBB.ConnectionDDBB;

public class ProveedorDAO {

	private List<ProveedorDTO> proveedores = new ArrayList();
	
	
	public Integer insertProveedor (ProveedorDTO proveedor) {
		
		Integer resultado = null;
		String query = String.format("INSERT INTO proveedores (nombre, rut, direccion, correo, telefono, contacto, telefono_contacto) "
				+ "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s'"+")", proveedor.getNombre(), proveedor.getRut(),proveedor.getDireccion(), proveedor.getCorreo(), proveedor.getTelefono(),proveedor.getContacto(), proveedor.getTelefonoContacto() );
		Connection con = ConnectionDDBB.getConnection();
		try {
			Statement st = con.createStatement();
			resultado = st.executeUpdate(query);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return resultado;
	}
	
	
	public List <ProveedorDTO>listarProveedores() {
		List<ProveedorDTO> proveedoresBBDD = new ArrayList<>();
		ResultSet resultado = null;
		String query = "SELECT * FROM proveedores;";
		Connection con = ConnectionDDBB.getConnection();
		try {
			Statement st = con.createStatement();
			resultado = st.executeQuery(query);
			while(resultado.next()) {
				ProveedorDTO proveedor = new ProveedorDTO(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(5), resultado.getString(6), resultado.getString(7));
				proveedoresBBDD.add(proveedor);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
			
		return proveedoresBBDD;
	}
	
	

	
}
