<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel= "stylesheet">
<body background="resources/img/gokuImagem.jpg">
	<div id="conteudo" style="container"  class="col-xs-12 col-sm-8 col-md-9">
	
	<h1>${title}</h1>
	<h1>Venha conhecer a minha loja Ecommerce. 
	<br>
	 Acesse a área de Administração : ${message}</h1>

	<sec:authorize access="hasRole('ROLE_USER')">
		<!-- For login user -->
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>
				Usuário : ${pageContext.request.userPrincipal.name} | 
								
					<a class="btn btn-danger" href="javascript:formSubmit()"> Sair do Sistema</a>
				
			</h2>
		</c:if>


	</sec:authorize>
	</div>
</body>
</html>