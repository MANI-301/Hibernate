package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Fetch {
	public static void main(String[]args) {
		//Object 
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Product p = em.find(Product.class,1);
		
		if(p!=null) {
		System.out.println(p);
		}
		else {
			System.out.println("Data Not Found");
		}
	}


}
