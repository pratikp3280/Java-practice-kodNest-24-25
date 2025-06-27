package Type_2;
//Methods with Parameters but without Return Values
public class UserInfo {
	void displayUser(String name, int age) { // Method with parameters
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
    }

    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        user.displayUser("Alice", 25); // Call the method with parameters
    }
}
