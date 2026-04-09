package OTM;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Batch b = em.find(Batch.class, "M105");
		
		Student s1 = new Student();
		s1.setName("Vijay");
		s1.setGender("male");
		s1.setPhone(987654334);
		s1.setEmail("vijay@gmail");
		
		b.addStudent(s1);
		
		
	}
}
