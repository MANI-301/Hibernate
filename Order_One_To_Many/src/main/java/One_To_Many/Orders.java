package One_To_Many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {

	@Id
	private int oid;
	private String orderdate;
	private double totalAmount;
	
	
	@OneToMany
	private List<OrderItem> ot;


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
	}


	public String getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public OrderItem getOt() {
		return ot;
	}


	public void setOt(OrderItem ot) {
		this.ot = ot;
	}


	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", orderdate=" + orderdate + ", totalAmount=" + totalAmount + ", ot=" + ot + "]";
	}
	
	
	
	
	
}
