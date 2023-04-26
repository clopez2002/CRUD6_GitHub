<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 4/20/2023
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>

    <!-- aca le indicamos donde estan los resources -->

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"  />


</head>
<body>

    <h1>Runners List</h1>

    <table border="1"> <!-- Crea un marco para la lista, asi se ve mas prolijo-->

        <tr>

            <th>Nombre</th>
            <th>Apellido</th>
            <th>Mail</th>
            <th>DNI</th>
            <th>Tiempo</th>

            <!-- Columna de Modificar/update -->
            <th>Modificar</th>


        </tr>

            <c:forEach var="runnersTEMP" items="${runnersAttribute}">

                <c:url var="linkUpdateRunner" value="/runnersURL/showUpdateURL"> <!-- a esta url le tenemos que pasar el id -->

                    <c:param name="runnerIDParam" value="${runnersTEMP.id}"/>
                </c:url>

                <tr>

                        <td>${runnersTEMP.nombre}</td>
                        <td>${runnersTEMP.apellido}</td>
                        <td>${runnersTEMP.email}</td>
                        <td>${runnersTEMP.dni}</td>
                        <td>${runnersTEMP.tiempo}</td>

                        <td><a href="${linkUpdateRunner}"><input type="button" value="Modificar"/></a> </td>


                </tr>

            </c:forEach>

    </table>

    <br/>

    <!-- La siguiente linea construye un boton, y nos indica el archivo donde se vana insertar los nuevos corredores-->

    <input type="button" value="Insert Runner" onclick="window.location.href='insertRunnerURL'; return false"/> <!-- redirigirnos a la pagina jsp con el formulario -->

</body>
</html>
