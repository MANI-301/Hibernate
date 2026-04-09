package ONE_TO_MANY;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Remove {

	public static void main(String[] args) {
		
		EntityManagerFactory emf  =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b = em.find(Bank.class, 1);
		
		Account s = em.find(Account.class, 2);
		
		b.Remove(s);
		
		et.begin();
		em.merge(b);
		em.remove(s);
		et.commit();
	    
		System.out.println("Removed");
	}
}
