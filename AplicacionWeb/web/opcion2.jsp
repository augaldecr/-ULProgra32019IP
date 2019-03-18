<%-- 
    Document   : opcion1
    Created on : 18/03/2019, 02:41:16 PM
    Author     : INNOVACION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo estudiante</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <div class="jumbotron">
                        <h1>Ingresar nuevo estudiante</h1>
                    </div>
                    <form method="get" action="obtenerNombre.jsp">
                        <div class="form-group">
                            <label for="nombre">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre"
                                   aria-describedby="nombreAyuda" placeholder="Ingrese su nombre">
                            <small id="nombreAyuda" class="form-text text-muted">Por favor ingrese su nombre.</small>
                        </div>
                        <div class="form-group">
                            <label for="apellido1">Primer apellido</label>
                            <input type="text" class="form-control" id="apellido1" name="apellido1"
                                   aria-describedby="apellido1Ayuda" placeholder="Ingrese su primer apellido">
                            <small id="apellido1Ayuda" class="form-text text-muted">Por favor ingrese su primer apellido.</small>
                        </div>
                        <div class="form-group">
                            <label for="apellido2">Segundo apellido</label>
                            <input type="text" class="form-control" id="apellido2" name="apellido2"
                                   aria-describedby="apellido2Ayuda" placeholder="Ingrese su segundo apellido">
                            <small id="apellido2Ayuda" class="form-text text-muted">Por favor ingrese su segundo apellido.</small>
                        </div>
                        <div class="form-group">
                            <label for="email">Correo electrónico</label>
                            <input type="email" class="form-control" id="email" name="email"
                                   aria-describedby="emailHelp" placeholder="Ingrese su correo electrónico">
                            <small id="emailHelp" class="form-text text-muted">Por favor ingrese su correo electrónico.</small>
                        </div>
                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
