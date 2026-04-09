package ONE_TO_MANY;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchAll {

	public static void main(String[]args) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	    EntityManager em = emf.createEntityManager();

	    List<Account> account = em.createQuery("SELECT a FROM Account a", Account.class).getResultList();

	    for (Account a : account) {
	    	System.out.println();
	        System.out.println(" Bank: " + a.getBank().getName());
	        System.out.println("Account No: " + a.getAccountnumber());
	        System.out.println("Account type: " + a.getAccounttype());
	        
	        System.out.println("Balance: " + a.getBalance());
	    }

	}

}
