<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel= "stylesheet">



<title>Página de Login</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 400px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body background="resources/img/gokuImagem.jpg" onload='document.loginForm.username.focus();'>
	<div id="conteudo" style="container"  class="col-xs-12 col-sm-8 col-md-9">

	<h1>OLÁ EU SOU O GOKU!! E-COMMERCE</h1>

	<div id="login-box" >

		<h2>Entre com usuário e senha</h2>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>

		<table class="table table-striped">
			<tr>
				<td>Usuário:</td>
				<td><input type='text' name='username'></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input class="btn btn-success" name="submit" type="submit"
				  value="Entrar" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
	</div>
	</div>
</body>
</html>