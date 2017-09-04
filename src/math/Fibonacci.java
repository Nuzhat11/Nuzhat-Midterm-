package math;

public class Fibonacci {
    public static void main(String[] args) {
        int n, x = 0, y = 0, z = 1;
        System.out.print("Fibonacci: ");
        for(int i = 1; i <= 40; i++)
        {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x+ " ");
        }
    }
}