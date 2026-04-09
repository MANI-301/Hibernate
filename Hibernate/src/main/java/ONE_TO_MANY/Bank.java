package ONE_TO_MANY;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Bank {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String branch;
	private String loc;
	private String ifsc; 

	@OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
	private List<Account> list ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + ", loc=" + loc + ", ifsc=" + ifsc + "]";
	}


	public void Insert(Account a) {
		list.add(a);
		a.setBank(this);
	}
	
    public void Remove(Account a1) {
		
		list.remove(a1);
		a1.setBank(null);
    }
    
    public void updateAccount(Account a,long AccountNumber, double newBalance, String newType, String Createddate) {
        if (list.contains(a)) {
        	a.setAccountnumber(AccountNumber);
            a.setBalance(newBalance);
            a.setAccounttype(newType);
            a.setCreateddate(Createddate);
        }
    }

    
    }
