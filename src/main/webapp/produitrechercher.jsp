<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="fr-FR">
    <head>
        <title>Rechercher un produit - Gestionnaire du magasin</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel=stylesheet href="${css}" />
    </head>
    <body>
    	<jsp:include page="nav.jsp">
    		<jsp:param value="produitrechercher" name="encours"/>
    	</jsp:include>
    	<main class="produit rechercher">
    		<fieldset>
    			<legend>Recherche un produit</legend>
	    		<form action="${urlProduitRechercher}" method="get" id="form_produit_rechercher">
	    			<div class="form_ligne">
	    				<label for="form_produit">N° de produit :</label>
	    				<input type="number" min="0" name="produit" id="form_produit" value="${param.produit}" required />
    				</div>
    				<div class="form_ligne">
	    				<button type="submit">Rechercher</button>
    				</div>
	    		</form>
    		</fieldset>
    		<c:if test="${not empty param.produit}">
    			<div class="info">
    				<c:choose>
			    		<c:when test="${empty produit}">
			    			Aucun produit n'a ce numéro.
			    		</c:when>
			    		<c:otherwise>
		    				<p>Le produit a été trouvé :</p>
		    				<ul>
		    					<li><em>N° de produit :</em> <strong>${produit.idProduit}</strong></li>
		    					<li><em>Marque :</em> <strong>${produit.marque}</strong></li>
		    					<li><em>Description :</em> <strong>${produit.description}</strong></li>
		    					<li><em>Prix :</em> <strong class="prix">${produit.prix}</strong></li>
		    				</ul>
			    		</c:otherwise>
	    			</c:choose>
    			</div>
    		</c:if>
		</main>
		<script src="${js}"></script>
    </body>
</html>