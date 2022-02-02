package com.msdev.produithibernate.DAO;

import javax.persistence.*;

public class ConnectionDB {
	private static final String ENTITY_MANAGER = "magasin";
    private static EntityManagerFactory entityManagerFactory = null;

	public static void connect() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory(ENTITY_MANAGER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
