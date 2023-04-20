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
</head>
<body>

    <table>

        <tr>

            <th>Nombre</th>

            <th>Apellido</th>

            <th>Mail</th>

            <th>DNI</th>

            <th>Tiempo</th>


        </tr>

            <c:forEach var="runnersTEMP" items="${runnersAttribute}">

                <tr>

                        <td>${runnersTEMP.nombre}</td>
                        <td>${runnersTEMP.apellido}</td>
                        <td>${runnersTEMP.email}</td>
                        <td>${runnersTEMP.dni}</td>
                        <td>${runnersTEMP.tiempo}</td>


                </tr>



            </c:forEach>

    </table>

</body>
</html>
