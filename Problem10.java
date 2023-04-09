import java.util.Scanner;

public class Problem10 {
    static Scanner scanner = new Scanner(System.in);
    static int a;
    static int b;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputA();
        inputB();
        System.out.println(findGcd(a, b));
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
    private static void inputB() {
        System.out.print("Enter b: ");
        String inputB = scanner.nextLine();
        b = Integer.parseInt(inputB);
    }

    /*
    @findGcd - finds greatest common divisor
    @a - first number
    @b - second number
    @return - gcd
 */
    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
}
