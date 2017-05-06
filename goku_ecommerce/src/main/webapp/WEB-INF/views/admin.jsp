<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel= "stylesheet">
	
	<style>
         .tamanhoBotao {
             width: 100%;
             height: 7%;
         }
         
         .tamanhodiv {
             width: 45%;
             margin-right: 5%;
     	
             
         }
         
         .espacamento {
             margin-bottom: 18%;
         }
	</style>
     
<body background="resources/img/gokuImagem.jpg">
	<div id="conteudo" style="container"  class="col-xs-12 col-sm-8 col-md-9">
	<h1>${title}</h1>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}"/>
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>


	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h1>
			Seja bem vindo : ${pageContext.request.userPrincipal.name} | <a class="btn btn-danger"
				href="javascript:formSubmit()"> Sair do Sistema</a>
		</h1>
	</c:if>	
	
	<div class="espacamento">
	</div>
	
	<div class="tamanhodiv" style="float: left" >
	
	<form method="post" action="${pageContext.request.contextPath}/cadastrarUsuario">	
		<input class="btn btn-success tamanhoBotao" type="submit" name="Cadastrar Usuário" value="Cadastrar Usuario" >
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />  
	</form>
	</div>  
		
	<div class="tamanhodiv" style="float: right" >
	<form method="post" action="${pageContext.request.contextPath}/buscarEndereco">
		<input class="btn btn-success tamanhoBotao"  type="submit" name="Buscar Endereco" value="Buscar Endereco">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> 
	</form>
	
	</div>
	</div>
</body>
</html>