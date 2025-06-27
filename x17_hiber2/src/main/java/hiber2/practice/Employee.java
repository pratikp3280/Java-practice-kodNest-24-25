package hiber2.practice;

import jakarta.persistence.*;

@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)                // primary key
    private int id;
    @Column(name = "full_name")
    private String name;
    private double salary;
    private String designation;
    private String department;
	
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    //parameterized construcor
	public Employee(String name, double salary, String designation, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override       // toString method is Overrriden for Better Console Output
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", department=" + department + "]";
	}
    
    
}