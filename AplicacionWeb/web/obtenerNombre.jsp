<%-- 
    Document   : obtenerNombre
    Created on : 18/03/2019, 03:50:01 PM
    Author     : INNOVACION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos de formulario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <div class="jumbotron">
                        <h1>Inicio</h1>
                    </div>
                    <body>
                        <%String nombre = request.getParameter("nombre");
                            String apellido1 = request.getParameter("apellido1");
                            String apellido2 = request.getParameter("apellido2");
                            String email = request.getParameter("email");
                            String salida = "Nombre: " + nombre + ", primer apellido: " + apellido1
                                    + ", segundo apellido: " + apellido2 + ", email: "
                                    + email + ".";
                        %>
                        <%=salida%>
                    </body>                    
                </div>
            </div>
        </div>
    </body>
</html>
