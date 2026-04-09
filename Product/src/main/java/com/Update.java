package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Product p = em.find(Product.class, 1);
		
		if(p!=null) {
			p.setPrice(55000);
			p.setRating(3);
			
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("Data Updated");
			
		}
		else {
			System.out.println("Data Not Found");
		}
	}

}
