package com.msdev.produithibernate.entity;

import javax.persistence.*;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProduit;
	private String marque;
	private String description;
	private double prix;
	
	public Produit() {}
	
	public Produit(String marque, String description, double prix) {
		this.marque = marque;
		this.description = description;
		this.prix = prix;
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
