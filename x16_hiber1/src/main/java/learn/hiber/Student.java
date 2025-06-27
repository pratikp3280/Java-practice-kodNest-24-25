package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int KodId;
	String name;
	String address;
	int year;
	
	public Student() {
		super();
		
	}
	
	// Paramaeterized Constructor
	public Student(int KodId, String name, String address,  int year ){
		this.KodId = KodId;
		this.name = name;
		this.address = address;
		this.year = year;
		
	}

	public int getKodId() {
		return KodId;
	}

	public void setKodId(int kodId) {
		KodId = kodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [KodId=" + KodId + ", name=" + name + ", address=" + address + ", year=" + year + "]";
	}
	
	
	
	
}