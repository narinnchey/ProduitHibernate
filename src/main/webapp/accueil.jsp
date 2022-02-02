<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="fr-FR">
    <head>
        <title>Accueil - Gestionnaire du magasin</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel=stylesheet href="${css}" />
    </head>
    <body>
    	<jsp:include page="nav.jsp">
    		<jsp:param value="accueil" name="encours"/>
    	</jsp:include>
    	<main class="accueil">
    		<div>
    			Bienvenue sur le gestionnaire du magasin !
    		</div>
		</main>
		<script src="${js}"></script>
    </body>
</html>