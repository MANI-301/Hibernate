package ONE_TO_MANY;

import java.util.*;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Bank b = new Bank();
		b.setName("Indian");
		b.setBranch("vadapalani");
		b.setIfsc("500003WADSF");
		b.setLoc("chennai");
		
		
		Account a1  = new Account();
		a1.setAccountnumber(345678234);
		a1.setAccounttype("Savings");
		a1.setBalance(1000000);
		a1.setCreateddate("10-sep-2025");
		a1.setBank(b);
		
		Account a2  = new Account();
		a2.setAccountnumber(795618234);
		a2.setAccounttype("current");
		a2.setBalance(5000000);
		a2.setCreateddate("20-sep-2025");
		a2.setBank(b);
		
		Account a3  = new Account();
		a3.setAccountnumber(945278216);
		a3.setAccounttype("Savings");
		a3.setBalance(8000000);
		a3.setCreateddate("29-sep-2025");
		a3.setBank(b);
		
		
	    List<Account> list = new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		b.setList(list);
		
		
		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
		
		System.out.println("Data saved");
		
	}

}
