package Anonymous_class;

public class Main {
    public static void main(String[] args) {
        Greeter anonymousGreeter = new Greeter() {
            public String greet() {
                return "Hello from Anonymous Inner Class!";
            }
        };
        System.out.println(anonymousGreeter.greet());
    }
}





//anonymous Object class  creation
//Greeter anonymousGreeter = new Greeter() {
//    public String greet() {
//        return "Hello from Anonymous Inner Class!";
//    }
//};