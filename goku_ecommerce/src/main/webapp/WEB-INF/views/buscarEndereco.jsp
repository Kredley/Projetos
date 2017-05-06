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
				if(document.getElementById("cep").value.length < 3){
					alert('Por favor, o campo CEP deve ter mais que 3 letras');
					document.getElementById("cep").focus();
					return false
				}
				
				if(document.getElementById("endereco").value.length < 3){
					alert('Por favor, o campo ENDERECO deve ter mais que 3 letras');
					document.getElementById("endereco").focus();
					return false
				}
				
				if(document.getElementById("estado").value.length < 3){
					alert('Por favor, o campo ESTADO deve ter mais que 3 letras');
					document.getElementById("estado").focus();
					return false
				}
				
				if(document.getElementById("cidade").value.length < 3){
					alert('Por favor, o campo CIDADE deve ter mais que 3 letras');
					document.getElementById("cidade").focus();
					return false
				}
			}
			
			function valida_buscaCep (){
				if(document.getElementById("buscaCep").value.length < 3){
					alert('Por favor, o campo CEP de busca deve ter mais que 3 letras');
					document.getElementById("cep").focus();
					return false
				}
			}
			
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
			
			function somenteNumeros(num) {
		        var er = /[^0-9.]/;
		        er.lastIndex = 0;
		        var campo = num;
		        if (er.test(campo.value)) {
		          campo.value = "";
		        }
		    }
		</script>
	
	<h2>
			Usuario : ${pageContext.request.userPrincipal.name} | <a class="btn btn-danger"
				href="javascript:formSubmit()"> Sair do Sistema</a>
	</h2>	
	
	
	<h1>Busca de Endereço</h1>
	
	
	<form action="${pageContext.request.contextPath}/buscarEndereco" method="post" onsubmit="return valida_buscaCep(this)" >
	<table>
			<tr>
				<td>Digite o Cep para busca:</td>
				<td><input type='text' name="buscaCep" id="buscaCep" onkeyup="somenteNumeros(this);"></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" class="btn btn-primary"
				  value="buscar" /></td>
			</tr>
	</table>		
			
		<c:if test="${not empty cep}">
			
		<div align="center">
		<table id = "retornoCep">
			<tr>
				<td>Cep:</td>
				<td>${cep}</td>
			</tr>
			<tr>
				<td>Endereco:</td>
				<td>${endereco}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>${estado}</td>
			</tr>
			<tr>
				<td>Cidade:</td>
				<td>${cidade}</td>
			</tr>
		</table>
		</div>
		</c:if>

			
	
	<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	
	
	<h1>Cadastro de Endereço</h1>
	
	<form action="${pageContext.request.contextPath}/buscarEndereco" method="post" onsubmit="return valida_form(this)">
	<table>
			<tr>
				<td>Cep:</td>
				<td><input type='text' name="cep" id="cep" onkeyup="somenteNumeros(this);"></td>
			</tr>
			<tr>
				<td>Endereco:</td>
				<td><input type='text' name="endereco" id="endereco" /></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input type='text' name="estado" id="estado" /></td>
			</tr>
			<tr>
				<td>Cidade:</td>
				<td><input type='text' name="cidade" id="cidade" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" class="btn btn-success"
				  value="enviar" /></td>
			</tr>
	</table>
	<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	
	<h2  style="color:#FF0000">${sucesso}</h2>

	
	</div>
</body>
</html>