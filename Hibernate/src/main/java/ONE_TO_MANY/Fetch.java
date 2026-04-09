package ONE_TO_MANY;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	    EntityManager em = emf.createEntityManager();

		Account account = em.find(Account.class, 1);
		
	    if (account != null) {
	    	System.out.println("Bank: " + account.getBank().getName());
	        System.out.println("Account No: " + account.getAccountnumber());
	        System.out.println("Current Balance: " + account.getBalance());
	    } else {
	        System.out.println("Account not found!");
	    }

	    em.close();
	    emf.close();
	}

}
