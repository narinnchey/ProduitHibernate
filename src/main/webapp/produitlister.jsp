<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="fr-FR">
    <head>
        <title>Lister les produits - Gestionnaire du magasin</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel=stylesheet href="${css}" />
    </head>
    <body>
    	<jsp:include page="nav.jsp">
    		<jsp:param value="produitlister" name="encours"/>
    	</jsp:include>
    	<main class="produit lister">
    		<h1>Liste des produits</h1>
    		<c:choose>
    			<c:when test="${produits.size() < 1}">
    				<div class="info">Aucun produit.</div>
    			</c:when>
    			<c:otherwise>
    				<table>
    					<thead>
    						<tr>
    							<th>ID</th>
    							<th>Marque</th>
    							<th>Description</th>
    							<th>Prix</th>
   							</tr>
						</thead>
						<tbody>
		    				<c:forEach var="p" items="${produits}">
		    					<tr>
		    						<td>${p.idProduit}</td>
		    						<td>${p.marque}</td>
		    						<td>${p.description}</td>
		    						<td class="prix">${p.prix}</td>
		    					</tr>
		    				</c:forEach>
						</tbody>
    				</table>
    			</c:otherwise>
    		</c:choose>
		</main>
		<script src="${js}"></script>
    </body>
</html>