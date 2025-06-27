package Method_Overloading;

public class OverloadingExample {
    void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    void printInfo(String name, int age , double salary) {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.printInfo("Alice");
        example.printInfo("Alice", 25);
        example.printInfo("Alice", 25 , 250000.512);
    }
}
