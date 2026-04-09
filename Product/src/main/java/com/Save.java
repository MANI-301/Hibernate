package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	public static void main(String[]args) {
		//Object 
		Product p = new Product();
		
		p.setPid(2);
		p.setType("Mobile");
		p.setPrice(30000);
		p.setBrand("Realme");
		p.setRating(5);
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		et.begin();
		em.persist(p);
		et.commit();
		
		System.out.println("Data Saved");
		
	}

}
