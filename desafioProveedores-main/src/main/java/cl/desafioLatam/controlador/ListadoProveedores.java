package cl.desafioLatam.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafioLatam.DAO.ProveedorDAO;
import cl.desafioLatam.DTO.ProveedorDTO;
import cl.desafioLatam.conectionDDBB.ConnectionDDBB;
import cl.desafioLatam.servicios.ServicioProveedorDAO;
import cl.desafioLatam.utilidades.ProveedorEstado;

/**
 * Servlet implementation class ListadoProveedores
 */
@WebServlet("/ListadoProveedores")
public class ListadoProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoProveedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioProveedorDAO servicioProveedor = new ServicioProveedorDAO();
		ProveedorDTO proveedor = new ProveedorDTO(0, request.getParameter("nombreTxt"), request.getParameter("rutTxt"), request.getParameter("direccionTxt"), request.getParameter("correoTxt"), request.getParameter("telefonoTxt"), request.getParameter("contactoTxt"), request.getParameter("telefonoContactoTxt"));

		ProveedorEstado  proveedorEstado = servicioProveedor.nuevoProveedor(proveedor);
		
		if(proveedorEstado == ProveedorEstado.PROVEEDOR_CON_DATOS) {
			response.sendRedirect("index.jsp");
		}else {
			request.setAttribute("Error", proveedorEstado.getMensaje());
			request.getRequestDispatcher("errorVista.jsp").forward(request, response);
		}
		 
		
	}

}
