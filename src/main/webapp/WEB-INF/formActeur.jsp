<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire acteur</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>

	<form method="post" action="saveActeur" modelAttribute="acteur">
	
		<div class="mb-3">
			<label for="nom" class="form-label">Nom</label> 
			<input type="text" name="nom" class="form-control" id="nom">
		</div>
		<div class="mb-3">
			<label for="prenom" class="form-label">Prénom</label> 
			<input type="text" name="prenom" class="form-control" id="prenom">
		</div>
		<div class="mb-3">
			<label for="email" class="form-label">Email</label> 
			<input type="email" name="email" class="form-control" id="email">
		</div>
		<div class="mb-3">
			<label for="ville" class="form-label">Ville</label> 
			<input type="text" name="ville" class="form-control" id="ville">
		</div>
		
		<button type="submit" class="btn btn-outline-success btn-sm">Valider</button>
		<button type="reset" class="btn btn-outline-secondary btn-sm">Annuler</button>
		
		
	
	</form>
	
</body>
</html>