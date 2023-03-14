<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
	<form method="post" action="saveUser" modelAttribute="utilisateur">
	
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
		
		
	
	</form>
</body>
</html>