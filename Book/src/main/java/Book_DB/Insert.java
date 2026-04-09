package Book_DB;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.setId(3);
		b.setTitle("Money");
		b.setAuthor("Mani");
		b.setGenre("Real-Story");
		b.setPublishedYear(2010);
		b.setPrice(400000);
		b.setAvailable(false);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mani");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(b);
		et.commit();
		
		System.out.println("Data Saved");
	}

}
