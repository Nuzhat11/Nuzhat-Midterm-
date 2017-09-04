package math;


public class Factorial {

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int i, f = 1;
        int number = 5;
        f = factorial(number);
        System.out.println("The factorial of " + number + " is: " + f);
    }

}
