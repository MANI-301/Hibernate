package OTM;


		import jakarta.persistence.EntityManager;
		import jakarta.persistence.EntityManagerFactory;
		import jakarta.persistence.EntityTransaction;
		import jakarta.persistence.Persistence;

		public class Mainclass {

			public static void main(String[] args) {
				
				EntityManagerFactory emf  = Persistence.createEntityManagerFactory("OTM");
				EntityManager em  = emf.createEntityManager();
				EntityTransaction et  = em.getTransaction();
				
				Passanger p1 = new Passanger();
				
				
				

	}


