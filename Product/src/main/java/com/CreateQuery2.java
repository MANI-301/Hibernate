package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CreateQuery2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
	Query q =	em.createQuery("Select p from Product p where p.brand = 'hp'");
		
	Object  o = q.getSingleResult();
	
	Product p = (Product) o;
	
	System.out.println(p);
	}
}
