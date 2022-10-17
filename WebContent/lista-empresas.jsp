<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>


<c:if test="${not empty empresa}">
    Empresa ${empresa } cadastrada com sucesso!
</c:if>

<p> Lista de empresas:</p>

<ul>


    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li> ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </li>
        </c:forEach>
    </ul>


<%--    <%--%>
<%--        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");--%>
<%--        for (Empresa empresa : lista) {--%>
<%--    %>--%>
<%--    <li><%= empresa.getNome() %></li>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
</ul>

</body>
</html>


