import java.util.Scanner;

public class Problem5 {
    static Scanner scanner = new Scanner(System.in);
    static int n;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        System.out.println(findFibonacci(n));
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
    @findFibonacci - finds n-th element in Fibonacci sequence
    @n - order of n-th element
    @return - fibonacci
 */
    private static int findFibonacci(int n) {
        if (n == 0) {                       // if 0 elements - returns 0
            return 0;
        } else if (n == 1) {                // if 1 element 0 returns 1
            return 1;
        } else {                            // in other case, returns n-th element
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
}
