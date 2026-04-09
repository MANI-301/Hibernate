package One_One;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainClass {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	

}
