package com.msdev.produithibernate.model;

import com.msdev.produithibernate.entity.Produit;

public class ProduitModel {
	private int idProduit;
	private String description;
	private String marque;
	private double prix;

	public ProduitModel(Produit p) {
		idProduit = p.getIdProduit();
		description = p.getDescription();
		marque = p.getMarque();
		prix = p.getPrix();
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
