package OTM;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Batch {
	@Id
	private String code;
	private String subject;
	private String time;
	private String trainer;
	private int no_of_students;
	
	
	@OneToMany
	private List<Student> list ;


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


	public int getNo_of_students() {
		return no_of_students;
	}


	public void setNo_of_students(int no_of_students) {
		this.no_of_students = no_of_students;
	}


	public List<Student> getList() {
		return list;
	}


	public void setList(List<Student> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Batch [code=" + code + ", subject=" + subject + ", time=" + time + ", trainer=" + trainer
				+ ", no_of_students=" + no_of_students + "]";
	}


	public void addStudent(Student s1) {
		list.add(s1);
		s1.setB(this);
		
	}


	public void removeStudent(Student s) {
		
		list.remove(s);
		s.setB(null);
		
	}


	
	
	
	

}
