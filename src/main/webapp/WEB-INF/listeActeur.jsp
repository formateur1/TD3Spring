<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Acteur</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container text-center">
	  <div class="row">
	    <div class="col">Id</div>
	    <div class="col">Nom</div>
	    <div class="col">Prénom</div>
	    <div class="col">Email</div>
	    <div class="col">Ville</div>
	    <div class="col">Action</div>
	  </div>
	  
	  <c:forEach var="act" items="${ listeA }">
		  <div class="row">
		  	<div class="col">
		  		${ act.getId() }
		  	</div>
		  	<div class="col"><c:out value="${ act.getNom() }"></c:out></div>
		    <div class="col"><c:out value="${ act.getPrenom() }"></c:out></div>
		    <div class="col"><c:out value="${ act.getEmail() }"></c:out></div>
		    <div class="col"><c:out value="${ act.getVille() }"></c:out></div>
		    <div class="col">
		    	<a href="deleteActeur/${ act.getId() }"> <button type="button" class="btn btn-outline-danger">Supprimer</button></a>
		    </div>
		  </div>
	  </c:forEach>
	  
	</div>

</body>
</html>