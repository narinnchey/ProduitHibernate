package com.msdev.produithibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msdev.produithibernate.DAO.ConnectionDB;
import com.msdev.produithibernate.DAO.IOperationsProduit;
import com.msdev.produithibernate.DAO.OperationsProduitImpl;
import com.msdev.produithibernate.util.Web;

/**
 * Servlet implementation class ProduitRechercherController
 */
@WebServlet(name = "produitrechercher", urlPatterns = "/rechercher-produit.html")
public class ProduitRechercherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOperationsProduit opProduit;

    @Override
    public void init() throws ServletException {
    	super.init();
    	ConnectionDB.connect();
    	opProduit = new OperationsProduitImpl(ConnectionDB.getEntityManagerFactory());
    }

    @Override
    public void destroy() {
    	ConnectionDB.getEntityManagerFactory().close();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Web.initAttributes(this, request);
		request.setAttribute("produit", opProduit.getProduit(request.getParameter("produit")));
		request.getRequestDispatcher("produitrechercher.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
