import java.util.Scanner;

public class Problem9 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int k;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        inputK();
        System.out.println(findBinomialCoefficient(n, k));
    }

    /*
    @inputA - takes user's input of a
 */
    private static void inputN() {
        System.out.print("Enter n: ");
        String inputN = scanner.nextLine();
        n = Integer.parseInt(inputN);
    }

    /*
    @inputN - takes user's input of n
 */
    private static void inputK() {
        System.out.print("Enter k: ");
        String inputK = scanner.nextLine();
        k = Integer.parseInt(inputK);
    }

    /*
    @findBinomialCoefficient - finds binomial coefficient
    @n - n argument
    @k - k argument
    @return - binomial coefficient
 */
    public static int findBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {         // if k is 0 or n, return 1
            return 1;
        } else {                // in other case, using binomial coefficient formula and recursion
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }
}
