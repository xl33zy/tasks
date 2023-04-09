import java.util.Scanner;

public class problem3 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int[] array;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        System.out.println(isPrime(n));
    }

    /*
    @inputN - takes user's input of n
 */
    private static void inputN() {
        System.out.print("Enter n: ");
        String inputN = scanner.nextLine();
        n = Integer.parseInt(inputN);
    }

    /*
    @isPrime - checks if a number is prime
    @n - a number
    @return - prime or not
 */
    private static String isPrime(int n) {
        if (n <= 1) {                  // 1 and all numbers less than 1 are not prime
            return "Composite";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {           // if n has a factor greater than its square root, then it must also have a factor less than its square root
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }

}
