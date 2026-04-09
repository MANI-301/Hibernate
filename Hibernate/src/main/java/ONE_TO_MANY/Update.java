package ONE_TO_MANY;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Bank b = em.find(Bank.class, 1);
		
		Account a1 = em.find(Account.class, 1);
		
		if(a1!=null) {
			a1.setAccountnumber(666666666);
			a1.setAccounttype("Savings");
			a1.setBalance(900000000);
			a1.setCreateddate("01-01-2025");
			
			
			et.begin();
			em.merge(a1);
			et.commit();
			System.out.println("Data Updated");
			
		}
		else {
			System.out.println("Data Not Found");
		}
	}

}

