<%-- 
    Document   : ejemplo
    Created on : 20 oct. 2020, 17:34:40
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="/Partials/head.jsp" %>
    </head>
    <body>
        <%@include file="/Partials/header.jsp" %>

        <%
            if (msg == null || !msg.equals("generado")) {
        %>
        <div class="container p-4">
            <div class="card p-4">
                <form action="Certificado" method="POST">
                    <div class="form-group">
                        <label for="#selPrograma">Programa</label>
                        <select class="form-control" id="selPrograma" name="programa"></select>
                    </div>
                    <div class="form-group text-center">
                        <button type="submit" name="accion" class="btn btn-primary">Generar Certificado</button>
                    </div>
                </form>
            </div>
        </div>
        <%
        } else {
        %>
        <div class="container p-4">
            <div class="card p-4">
                <div class="form-group text-center">
                    <a class="btn-block btn-lg btn-primary" href="Certificado.pdf">Descargar</a>
                </div>
            </div>
        </div>
        <%
            }
        %>

        <script>
            var selPrograma = $('#selPrograma');

            $(document).ready(function () {
                let accion = "darProgramas";
                selPrograma.empty();
                selPrograma.append(`<option value="vacio" selected> Seleccione Programa... </option>`);
                $.ajax({
                    type: 'GET',
                    url: 'ProgramaFormacion',
                    data: {accion: accion},
                    success: function (response) {
                        let programas = JSON.parse(response);
                        programas.forEach(programa => {
                            let template = '<option value="' + programa + '">' + programa + '</option>';
                            selPrograma.append(template);
                        });
                    }
                });
            });
        </script>

        <%@include file="/Partials/footer.jsp" %>
    </body>
</html>
