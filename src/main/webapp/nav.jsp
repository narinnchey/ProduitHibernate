<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<nav>
	<a class="nav accueil ${param.encours == 'accueil' ? 'en_cours' : ''}" href="${urlAccueil}">
		Accueil
	</a>
	<span>produit</span>
	<a class="nav sous produit ajouter ${param.encours == 'produitajouter' ? 'en_cours' : ''}" href="${urlProduitAjouter}">
		Ajouter
	</a>
	<a class="nav sous produit rechercher ${param.encours == 'produitrechercher' ? 'en_cours' : ''}" href="${urlProduitRechercher}">
		Rechercher
	</a>
	<a class="nav sous produit lister ${param.encours == 'produitlister' ? 'en_cours' : ''}" href="${urlProduitLister}">
		Lister
	</a>
</nav>