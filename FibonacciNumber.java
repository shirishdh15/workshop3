public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        int fib = 0, a = 1, b= 1, evenCount = 0;

        while (evenCount < n) {
            fib = a + b;
            b = a;
            a = fib;
            if (fib % 2 == 0) {
                evenCount++;
                if (evenCount == n) {
                    System.out.println("The " + n + "th even Fibonacci number is " + fib);
                    break;
                }
            }
        }
    }
}