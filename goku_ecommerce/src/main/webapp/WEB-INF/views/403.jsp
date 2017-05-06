<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel= "stylesheet">
<body background="resources/img/vedita.jpg" bgproperties="fixed">
	<div id="conteudo" style="container"  class="col-xs-12 col-sm-8 col-md-9">
	<h1 style="color:#FF0000">Seu poder é mais de 8mil!!!</h1>

	<c:choose>
		<c:when test="${empty username}">
		  <h2 style="color:#FF0000">Você não tem permissão para acessar a minha loja!</h2>
		</c:when>
		<c:otherwise>
		  <h2 style="color:#FF0000">Usuário : ${username} <br/>
                    Você não tem permissão para acessar a minha loja!</h2>
		</c:otherwise>
	</c:choose>
	</div>
</body>
</html>