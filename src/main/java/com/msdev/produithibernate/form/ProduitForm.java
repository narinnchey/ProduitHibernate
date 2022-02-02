package com.msdev.produithibernate.form;

public class ProduitForm extends BaseForm {
	private String rawDescription;
	private String rawMarque;
	private String rawPrix;
	private String errDescription;
	private String errMarque;
	private String errPrix;
	private String description;
	private String marque;
	private double prix;

	public ProduitForm(String rawMarque, String rawDescription, String rawPrix) {
		this.rawDescription = rawDescription;
		this.rawMarque = rawMarque;
		this.rawPrix = rawPrix;
	}

	@Override
	public boolean verifie() {
		if (rawDescription == null || rawDescription.trim().isEmpty()) {
			errDescription = "La description du produit doit être saisie.";
			erreur = true;
		} else {
			description = rawDescription.trim();
		}
		if (rawMarque == null || rawMarque.trim().isEmpty()) {
			errMarque = "La marque du produit doit être saisie.";
			erreur = true;
		} else {
			marque = rawMarque.trim();
		}
		if (rawPrix == null || rawPrix.isEmpty()) {
			errPrix = "Le prix du produit doit être saisi.";
			erreur = true;
		} else {
			try {
				prix = Double.parseDouble(rawPrix);
			} catch (NumberFormatException e) {
				errPrix = "Le prix du produit doit être un nombre réel.";
				erreur = true;
			}
		}
		return !erreur;
	}

	public String getRawDescription() {
		return rawDescription;
	}

	public void setRawDescription(String rawDescription) {
		this.rawDescription = rawDescription;
	}

	public String getRawMarque() {
		return rawMarque;
	}

	public void setRawMarque(String rawMarque) {
		this.rawMarque = rawMarque;
	}

	public String getRawPrix() {
		return rawPrix;
	}

	public void setRawPrix(String rawPrix) {
		this.rawPrix = rawPrix;
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
	
	public String getErrDescription() {
		return errDescription;
	}

	public void setErrDescription(String errDescription) {
		this.errDescription = errDescription;
	}

	public String getErrMarque() {
		return errMarque;
	}

	public void setErrMarque(String errMarque) {
		this.errMarque = errMarque;
	}

	public String getErrPrix() {
		return errPrix;
	}

	public void setErrPrix(String errPrix) {
		this.errPrix = errPrix;
	}

}
