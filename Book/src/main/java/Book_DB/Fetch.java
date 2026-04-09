package Book_DB;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Fetch {
	public static void main(String[]args) {
		//Object 
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("mani");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Book b = em.find(Book.class,1);
		
		if(b!=null) {
		System.out.println(b);
		}
		else {
			System.out.println("Data Not Found");
		}
	}


}
