package com.msdev.produithibernate.util;

import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Web {
	public static final String getUrl(HttpServlet context, String nomServlet) {
		ServletContext servletContext = context.getServletContext();
		ServletRegistration servletRegistration = servletContext.getServletRegistration(nomServlet);
		Collection<String> mappings = servletRegistration.getMappings();
		for (String u : mappings) {
			return servletContext.getContextPath()+u;
		}
		return "";
	}
	
	public static final String getFichier(HttpServlet context, String file) {
		return context.getServletContext().getContextPath() + file;
	}
	
	public static final void initAttributes(HttpServlet context, HttpServletRequest request) {
		request.setAttribute("css", getFichier(context, "/css/style.css"));
		request.setAttribute("js", getFichier(context, "/js/main.js"));
		request.setAttribute("urlAccueil", getUrl(context, "accueil"));
		request.setAttribute("urlProduitAjouter", getUrl(context, "produitajouter"));
		request.setAttribute("urlProduitRechercher", getUrl(context, "produitrechercher"));
		request.setAttribute("urlProduitLister", getUrl(context, "produitlister"));
	}
}
