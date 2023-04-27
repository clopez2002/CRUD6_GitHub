<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 4/25/2023
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- Para usar las JSP tag libs -->
<html>
<head>
    <title>Title</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"  /> <!-- Dinde estan los recursos visuales-->

</head>
<body>

    <form:form action="InsertRunnerInsert" modelAttribute="runnerAttributeToUpdate" method="POST">

            <form:hidden path="id"/>

            <table>

                <tr>
                    <td>Nombre</td>
                    <td><form:input path="nombre"/></td>  <!-- Aca esta el cuadro donde pondremos el texto-->
                </tr>

                <tr>
                    <td>Apellido</td>
                    <td><form:input path="apellido"/></td>
                </tr>

                <tr>
                    <td>Email</td>
                    <td><form:input path="email"/></td>
                </tr>

                <tr>
                    <td>DNI</td>
                    <td><form:input path="dni"/></td>
                </tr>

                <tr>
                    <td>Tiempo</td>
                    <td><form:input path="tiempo"/></td>
                </tr>

                <tr>

                    <td colspan="2"><input type="submit" value="Update"></td>

                </tr>

            </table>


    </form:form>





</body>
</html>
