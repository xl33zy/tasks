import java.util.Scanner;

public class Problem8 {
    static Scanner scanner = new Scanner(System.in);
    static String s;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputS();
        System.out.println(allDigits(s));
    }

    /*
    @inputS - takes user's input of s
 */
    private static void inputS() {
        System.out.print("Enter s: ");
        s = scanner.nextLine();
    }

    /*
    @allDigits - checks if string consists only of digits
    @s - string
    @return - whether is all digits or no
 */
    public static String allDigits(String s) {
        if (s.length() == 0) {      //  if empty string or all characters were checked, returns "Yes"
            return "Yes";
        }
        char character = s.charAt(0);
        if (character >= '0' && character <= '9') {       // if character is number, recursion called
            return allDigits(s.substring(1));
        } else {            // in other case, non-digit character found
            return "No";
        }
    }
}
