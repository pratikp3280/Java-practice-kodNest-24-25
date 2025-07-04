package model;

//A simple POJO (Plain Old Java Object) to represent a user
public class User {
	/* private so they can't be accessed directly from outside (data protection — called encapsulation). */
	private int id;
    private String name;
    private String email;
    private String password;
    private String role;
	
    // Default constructor
    public User() {
    }
    
 // You can also have other constructors
    public User( String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

   // Getters( Allow reading values.) and setters(Allow updating values.)
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
    
    
}
