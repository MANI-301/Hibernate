package OTM;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Maniclass {
	
	public static void main(String[] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Batch b = new Batch();
		b.setCode("M105");
		b.setSubject("Java");
		b.setTime("10:00");
		b.setTrainer("Tabrez");
		b.setNo_of_students(300);
		
		Student s1 = new Student();
		s1.setName("Mani");
		s1.setEmail("Mani@gmail");
		s1.setGender("Male");
		s1.setB(b);
		
		Student s2 = new Student();
		s1.setName("john");
		s1.setEmail("john@gmail");
		s1.setGender("Male");
		s1.setB(b);
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		b.setList(list);
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(b);
		et.commit();
		
		
		System.out.println("Data Saved");
		
		
	}

}
