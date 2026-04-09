
	package One_To_Many;

	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class MainClass{

		public static void main(String[] args) {
			
			EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
			EntityManager em  = emf.createEntityManager();
			EntityTransaction et  = em.getTransaction();
			
			OrderItem oi1 = new OrderItem ();
			
			oi1.setId(1);
			oi1.setProductname("Laptop");
			oi1.setQuantity(1);
			oi1.setPrice(30000);
			
OrderItem oi2 = new OrderItem ();
			
			oi2.setId(2);
			oi2.setProductname("mobile");
			oi2.setQuantity(2);
			oi2.setPrice(10000);
			
			Orders o = new Orders();
			o.setOid(1);
			o.setOrderdate("10-10-25");
			o.setTotalAmount(200000.0);
			
			
			
			
			et.begin();
			em.persist(o);
			em.persist(oi);
			et.commit();
			
			System.out.println("Data Saved");
		}

	}


