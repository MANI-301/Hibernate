package ONE_TO_MANY;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Bank b = em.find(Bank.class, 1);
		
		Account a4 = new Account();
		a4.setAccountnumber(765456789);
		a4.setAccounttype("Current");
		a4.setBalance(4000000);
		a4.setCreateddate("29-04-2022");
		a4.setBank(b);
		
		
		b.Insert(a4);
		et.begin();
		em.persist(b);
		et.commit();

		System.out.println("Inserted");
		
		
	}
}

