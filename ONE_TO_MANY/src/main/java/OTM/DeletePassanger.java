package OTM;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePassanger {

	public static void main(String [] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("OTM");
		EntityManager em  =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Passsanger p = em.find(Passanger.class, 3);
		Train t = em.find(Train.class, 98743);
		t.removePassanger
		}
}
