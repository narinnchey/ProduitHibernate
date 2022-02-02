package com.msdev.produithibernate.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.msdev.produithibernate.entity.Produit;
import com.msdev.produithibernate.form.ProduitForm;
import com.msdev.produithibernate.model.ProduitModel;

public class OperationsProduitImpl implements IOperationsProduit {
	private EntityManagerFactory entityManagerFactory;

	public OperationsProduitImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public List<ProduitModel> getProduits() {
		List<ProduitModel> liste = new ArrayList<ProduitModel>();
		EntityManager em = null;
		try {
			em = entityManagerFactory.createEntityManager();
			for (Object p : em.createQuery("from Produit").getResultList())
				liste.add(new ProduitModel((Produit) p));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null)
				em.close();
		}
		return liste;
	}

	@Override
	public ProduitModel getProduit(int id) {
		EntityManager em = null;
		Produit p = null;
		try {
			em = entityManagerFactory.createEntityManager();
			p = em.find(Produit.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null)
				em.close();
		}
		if (p == null)
			return null;
		return new ProduitModel(p);
	}

	@Override
	public ProduitModel getProduit(String id) {
		if (id == null)
			return null;
		try {
			return getProduit(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	@Override
	public Produit addProduit(ProduitForm form) {
		EntityManager em = null;
		Produit p = null;
		try {
			em = entityManagerFactory.createEntityManager();
			EntityTransaction trans = em.getTransaction();
	        trans.begin();
	        p = new Produit(form.getMarque(), form.getDescription(), form.getPrix());
	        em.persist(p);
	        trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null)
				em.close();
		}
		return p;
	}

}
