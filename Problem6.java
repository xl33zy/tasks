import java.util.Scanner;

public class Problem6 {
    static Scanner scanner = new Scanner(System.in);
    static int a;
    static int n;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputA();
        inputN();
        System.out.println(findPower(a, n));
    }

    /*
    @inputA - takes user's input of a
 */
    private static void inputA() {
        System.out.print("Enter a: ");
        String inputA = scanner.nextLine();
        a = Integer.parseInt(inputA);
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
    @findPower - finds a^n
    @a - number
    @n - degree
    @return - power
 */
    public static int findPower(int a, int n) {
        if (n == 0) {               // numbers to the 0 degree equal to 0
            return 1;
        } else if (n == 1) {        // to the 1 degree equal to itself
            return a;
        } else {                    // in other case, using recursion finds power
            int temporary = findPower(a, n/2);
            if (n % 2 == 0) {       // if n is even, returns the square of temporary
                return temporary * temporary;
            } else {                // in other case, returns a multiplied by temporary squared
                return a * temporary * temporary;
            }
        }
    }
}
