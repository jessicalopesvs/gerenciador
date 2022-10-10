<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/nova-empresa" var="linkToNovaEmpresa"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário de nova empresa</title>
</head>
<body>


<form action="${linkServletNovaEmpresa}" method="post">

    Nome: <input type="text" name="nome"/>
    Data Abertura: <input type="text" name="data"/>

    <input type="submit"/>
</form>

</body>
</html>