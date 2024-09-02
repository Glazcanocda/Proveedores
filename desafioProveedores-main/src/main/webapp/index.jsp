<%@page import="cl.desafioLatam.utilidades.ListaEstado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cl.desafioLatam.DTO.ProveedorDTO"%>
<%@page import="java.util.List"%>
<%@page import="cl.desafioLatam.servicios.ServicioProveedorDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proveedores</title>
<%@include file="./assets/html/importsHead.jsp"%>
<%
List<ProveedorDTO> proveedores = new ArrayList<>();

ServicioProveedorDAO servicioProveedor = new ServicioProveedorDAO();
ListaEstado listaEstado = servicioProveedor.listaProveedores(proveedores);
%>
</head>
<body>
	<section class="titulo text-center py-5">

		<h1>Proveedores</h1>
	</section>


	<section class="Formulario container">
	
		<h2>Ingreso de datos</h2>

		<div class="py-2">
			<p>Ingresa los datos del formulario:</p>
		</div>
		<form action="ListadoProveedores" method="post" class = "row">
				<div class="col-6">
				<input class="form-control" type="text"
				placeholder="Nombre Proveedor" aria-label="default input example"
				name="nombreTxt" data-toogle = ""> 
				</div>
			
				<div class = "col-6">
					<input class="form-control col-6" type="text"
				placeholder="Rut Proveedor" aria-label="default input example"
				name="rutTxt"> 
				</div>
				
				<div class ="col-12">
					<input class="form-control" type="text"
				placeholder="Dirección" aria-label="default input example"
				name="direccionTxt"> 
				</div>
			
				<div class="col-6">
				<input class="form-control" type="text"
				placeholder="Correo Electrónico" aria-label="default input example"
				name="correoTxt">
				</div>
				
				<div class="col-6">
				 <input class="form-control" type="text"
				placeholder="Telefono" aria-label="default input example"
				name="telefonoTxt"> 
				</div>
				<div class="col-6">
				<input class="form-control" type="text"
				placeholder="Contacto" aria-label="default input example"
				name="contactoTxt"> 
				</div>
				
			
				
				<div class="col-6 d-flex justify-content-center">
				<input class="form-control" type="text"
				placeholder="Telefono de Contacto"
				aria-label="default input example" name="telefonoContactoTxt">
</div>

			<button type="submit" class="btn btn-success mb-5" name="submit">Ingresar Datos</button>
		</form>

	</section>
	<hr>

	<section class="listaProveedoresCont container">

		<div class="tituloTablaProveedores text-center my-5">
			<h2>Listado Proveedores</h2>
		</div>

		<div class="tablaProveedores">

			<table class="table">
				<thead>
					<tr>
						<th scope="col"></th>
						<th scope="col">id</th>
						<th scope="col">Nombre Proveedor</th>
						<th scope="col">Rut</th>
						<th scope="col">Dirección</th>
						<th scope="col">Correo Electrónico</th>
						<th scope="col">Teléfono</th>
						<th scope="col">Contacto</th>
						<th scope="col">Telefono-Contacto</th>
						<th scope="col"></th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody class="table-group-divider">
					<%
					if (listaEstado == listaEstado.LISTA_CON_DATOS) {
					%>
					<%
					for (ProveedorDTO proveedor : proveedores) {
					%>
					<tr>
						<th scope="row">
							<%
							int i = 0;
							i++;
							%>
						</th>
						<td><%=proveedor.getId()%></td>
						<td><%=proveedor.getNombre()%></td>
						<td><%=proveedor.getRut()%></td>
						<td><%=proveedor.getDireccion()%></td>
						<td><%=proveedor.getCorreo()%></td>
						<td><%=proveedor.getTelefono()%></td>
						<td><%=proveedor.getContacto()%></td>
						<td><%=proveedor.getTelefonoContacto()%></td>
					</tr>
					<%
					}
					%>
					<%
					} else {
					%>

					<tr>
						<th scope="row"></th>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><%=listaEstado.getMensaje()%></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>

					<%
					}
					%>
				</tbody>
			</table>



		</div>




	</section>








	<%@include file="./assets/html/importsFoot.jsp"%>
</body>
</html>