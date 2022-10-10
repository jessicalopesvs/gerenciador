<%
    //scriplet
    String nomeEmpresa = (String)request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Empresa criada com sucesso</title>
</head>
<body>

<body>

<c:if test="${not empty empresa}">
Empresa ${empresa } cadastrada com sucesso!
</c:if>

<c:if test="${empty empresa}">
    Nenhuma empresa cadastrada!
</c:if>
 </body>

</body>
</html>