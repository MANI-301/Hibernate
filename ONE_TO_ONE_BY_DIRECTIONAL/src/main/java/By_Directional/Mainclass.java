package By_Directional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("OTO");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Aadhar a = new Aadhar();
		a.setAid(512765434567l);
		a.setAddress("Chennai");
		a.setPhone(9876543223l);
		a.setPincode(654343);
		
		
		
		Person p = new Person();
	    
		p.setName("MANI");
		p.setAge(21);
		p.setDob("29-04-2k");
		p.setGender("MALE");
		
		p.setAadhar(a);

		a.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("Data Saved");
	}

}
