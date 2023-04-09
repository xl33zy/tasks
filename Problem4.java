import java.util.Scanner;

public class Problem4 {
    static Scanner scanner = new Scanner(System.in);
    static int n;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        System.out.println(findFactorial(n));
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
    @findFactorial - finds factorial of a number
    @n - a number
    @return - factorial
 */
    private static int findFactorial(int n) {
        if (n == 0) {                       // factorial of 0 is 1
            return 1;
        } else {                            // in other case, multiplies n to n-1 to n-2 and so on using recursion
            return n * findFactorial(n-1);
        }
    }
}
