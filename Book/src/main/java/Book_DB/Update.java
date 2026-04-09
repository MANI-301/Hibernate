package Book_DB;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mani");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Book b = em.find(Book.class, 1);
		
		if(b!=null) {
			b.setPrice(00000);
			b.setTitle("The_LIFE_OF_MANI");
			
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Data Updated");
			
		}
		else {
			System.out.println("Data Not Found");
		}
	}

}
