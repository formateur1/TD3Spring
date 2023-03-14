<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>

	<form id="f" method="post" action="verifierUser" modelAttribute="utilisateur">
	
		<div class="mb-3">
			<label for="login" class="form-label">Login</label> 
			<input type="text" name="login" class="form-control" id="login">
		</div>
		<div class="mb-3">
			<label for="mdp" class="form-label">Mot de passe</label> 
			<input type="password" name="mdp" class="form-control" id="mdp">
		</div>
		
		
		<button type="submit" class="btn btn-outline-success btn-sm">Valider</button>
		<button type="reset" class="btn btn-outline-secondary btn-sm">Annuler</button>
		<button type="button" class="btn btn-outline-success btn-sm">
			<a href="inscription">Créer utilisateur</a>
		</button>
		<c:if test="${ err == 1 }">
			<p>Saisies incorrectes</p>
		</c:if>
		
	</form>
	
	
</body>
</html>