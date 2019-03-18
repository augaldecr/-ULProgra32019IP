<%-- 
    Document   : index
    Created on : 18/03/2019, 01:52:38 PM
    Author     : INNOVACION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <div class="jumbotron">
                        <h1 class="display-4" >Inicio</h1>
                    </div>

                    <h2>En esta página usted encontrará las siguientes opciones: </h2>
                    <ol class="list-group">
                        <%
                            String[] opciones = new String[4];
                            opciones[0] = "Mostrar listado de estudiantes.";
                            opciones[1] = "Insertar estudiante.";
                            opciones[2] = "Modificar estudiante.";
                            opciones[3] = "Eliminar estudiante.";

                            for (int i = 0; i < opciones.length; i++) {%>
                        <li class="list-group-item" >
                            <a class="btn btn-secondary btn-lg btn-block mt-1" href="opcion<%= i + 1%>.jsp" 
                               data-toggle="tooltip" data-placement="right" title="Clic aquí para <%= opciones[i]%>">
                                <%= opciones[i]%>
                            </a>
                        </li>
                            <% }%>
                    </ol>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script type="text/javascript">
            $(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
    </body>
</html>
