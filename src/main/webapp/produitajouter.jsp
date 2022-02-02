<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="fr-FR">
    <head>
        <title>Ajouter un produit - Gestionnaire du magasin</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel=stylesheet href="${css}" />
    </head>
    <body>
    	<jsp:include page="nav.jsp">
    		<jsp:param value="produitajouter" name="encours"/>
    	</jsp:include>
    	<main class="form produit ajouter">
    		<fieldset>
    			<legend>Ajouter un produit</legend>
	    		<form action="${urlProduitAjouter}" method="post" id="form_produit_ajouter">
	    			<div class="form_ligne">
	    				<label for="form_marque">Marque :</label>
	    				<input type="text" name="marque" id="form_marque" value="${param.marque}" required />
    				</div>
    				<c:if test="${not empty form && not empty form.errMarque}">
    					<div class="erreur">${form.errMarque}</div>
    				</c:if>
    				<div class="form_ligne">
	    				<label for="form_description">Description :</label>
	    				<input type="text" name="description" id="form_description" value="${param.description}" required />
    				</div>
    				<c:if test="${not empty form && not empty form.errDescription}">
    					<div class="erreur">${form.errDescription}</div>
    				</c:if>
    				<div class="form_ligne">
	    				<label for="form_prix">Prix :</label>
	    				<input type="number" name="prix" id="form_prix" value="${param.prix}" step="any" required />
    				</div>
    				<c:if test="${not empty form && not empty form.errPrix}">
    					<div class="erreur">${form.errPrix}</div>
    				</c:if>
    				<div class="form_ligne">
	    				<button type="submit" name="valider" value="oui">Ajouter</button>
    				</div>
    				<c:if test="${not empty errForm}">
    					<div class="erreur">${errForm}</div>
    				</c:if>
	    		</form>
    		</fieldset>
    		<c:if test="${not empty produit}">
    			<div class="info">
    				<p>Un produit a été ajouté :</p>
    				<ul>
    					<li><em>N° de produit :</em> <strong>${produit.idProduit}</strong></li>
    					<li><em>Marque :</em> <strong>${produit.marque}</strong></li>
    					<li><em>Description :</em> <strong>${produit.description}</strong></li>
    					<li><em>Prix :</em> <strong class="prix">${produit.prix}</strong></li>
    				</ul>
    			</div>
    		</c:if>
		</main>
		<script src="${js}"></script>
    </body>
</html>