package Book_DB;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {

	public static void main(String[]args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("mani");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Book b = em.find(Book.class, 2);
		
		if(b!=null) {
		et.begin();
		em.remove(b);
		et.commit();
		
		System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data Not Found");
		}
	}

}

