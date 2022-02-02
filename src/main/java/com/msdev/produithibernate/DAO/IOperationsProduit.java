package com.msdev.produithibernate.DAO;

import java.util.List;

import com.msdev.produithibernate.entity.Produit;
import com.msdev.produithibernate.form.ProduitForm;
import com.msdev.produithibernate.model.ProduitModel;

public interface IOperationsProduit {
	public ProduitModel getProduit(String id);
	public ProduitModel getProduit(int id);
	public List<ProduitModel> getProduits();
	public Produit addProduit(ProduitForm form);
}
