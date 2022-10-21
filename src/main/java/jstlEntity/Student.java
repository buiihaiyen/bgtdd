package jstlEntity;
import javax.persistence.Entity;
@Entity
public class Student {
	private String name; 
	private Double mark; 
	private String major; 
	public Student() { 
		
	}
	public Student (String name, Double mark, String major) { 
		this.setMajor (major); 
		this.setName(name); 
		this.setMark (mark);  
	}
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public Double getMark() { 
		return mark; 
	} 
	public void setMark (Double mark) {
		this.mark = mark ; 
	} 
	public String getMajor() { 
		return major; 
	} 
	public void setMajor(String major) { 
		this.major = major; 
	}

}
