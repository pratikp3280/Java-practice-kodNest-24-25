package $return;

public class FactorialWithReturn {
    public static void main(String[] args) {
        int num = 5; // Example number
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive calculation
    }
}
