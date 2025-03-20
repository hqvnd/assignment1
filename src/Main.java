public class Main {

    // Problem 1: Find the minimum of an array
    // Complexity: O(n)
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Problem 2: Calculate the average of an array
    // Complexity: O(n)
    public static double calcavg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Problem 3: Check if a number is prime
    // Complexity: O(√n)
    public static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Problem 4: Calculate factorial using recursion
    // Complexity: O(n)
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    // Problem 5: Find nth Fibonacci number using recursion
    // Complexity: O(2^n)
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Problem 6: Calculate power (a^n)
    // Complexity: O(n)
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Problem 7: Generate all permutations of a string
    // Complexity: O(n!)
    public static void genPerm(String str, String prefix) {
        if (str.length() == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                genPerm(rem, prefix + str.charAt(i));
            }
        }
    }

    // Problem 8: Check if a string consists only of digits
    // Complexity: O(n)
    public static boolean onlydigit(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    // Problem 9: Calculate combinations C(n, k)
    // Complexity: O(n)
    public static int combinations(int n, int k) {
        return fact(n) / (fact(k) * fact(n - k)); // didn't want to create another factorial function, just borrowed it
    }

    // Problem 10: Calculate GCD using recursion (Euclidean Algorithm)
    // Complexity: O(log(min(a, b)))
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1, 2, 3})); // Example

    }
}