public class Fib {
    public static void main(String args[]) {
        // Range of the Fibonacci Series
        int n = 7;
        int prev = 0, curr = 1, c;

        // Print the Initial Two Numbers
        System.out.print("Fibonacci series upto " + n + " : " + prev  + "  " + curr);

        for (int i = 2; i < n; i++) {
            // Calculate Next Number as Sum of Previous Two
            c = prev + curr;

            // Update Previous Two Numbers for Next Iteration.
            prev = curr;
            curr = c;

            System.out.print("  " + c); // Print Rest of the Numbers.
        }
    }
}
