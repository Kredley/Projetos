<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel= "stylesheet">

<body background="resources/img/gokuImagem.jpg">
	<div id="conteudo" style="container"  class="col-xs-12 col-sm-8 col-md-9">
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script type="text/javascript" language="javascript">
			function valida_form (){
				if(document.getElementById("usuario").value.length < 3){
					alert('Por favor, o campo usuário deve ter mais que 3 letras');
					document.getElementById("usuario").focus();
					return false
				}
				
				if(document.getElementById("senha").value.length < 3){
					alert('Por favor, o campo senha deve ter mais que 3 letras');
					document.getElementById("senha").focus();
					return false
				}
			}
			
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
		
	<h2>
		Usuario : ${pageContext.request.userPrincipal.name} | <a class="btn btn-danger"
			href="javascript:formSubmit()"> Sair do Sistema</a>
	</h2>
	
	<h1>Tela de Cadastro de Usuários</h1>
	
	<form action="${pageContext.request.contextPath}/cadastrarUsuario" method="post" onsubmit="return valida_form(this)">
	
		<table id = "tabela">
			<tr>
				<td>Usuario:</td>
				<td><input id="usuario" type="text" name="usuario" maxlength="100"/></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input id="senha" type="text" name="senha" maxlength="100"/></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" class="btn btn-success"
				  value="Salvar" /></td>
			</tr>
		</table>
		
		
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	
	<h2  style="color:#FF0000">${sucesso}</h2>
	
	</div>
</body>
</html>