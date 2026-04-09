package Dynamic_input;

import java.util.Scanner;

import com.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Fetch_By_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Starting Price:");
	    double st = sc.nextDouble();
	    
	    System.out.println("Enter Ending Price:");
	    double end = sc.nextDouble();
	    
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	    
	    EntityManager em = emf.createEntityManager();
	    
	    Query q = em.createQuery("select p from Product p where p.price between ?1 and ?2");
	    
	    q.setParameter(1, st);
	    q.setParameter(2,end);
	    
	    Object o = q.getResultList();
	    
	    Product p = (Product) o;
	    
	    
//	    for(Product p1 : ) {
//	    	System.out.println(p);
//	    }
		
	}

}
