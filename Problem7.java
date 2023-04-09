import java.util.Scanner;

public class Problem7 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int[] array;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        inputArray();
        outputReverse(n, array);
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
    @inputArray - takes user's input and saves the numbers to the array
 */
    private static void inputArray() {
        System.out.print("Enter the array: ");
        String inputArray = scanner.nextLine();

        String[] splittedArray = inputArray.split(" ");

        int[] arr = new int[splittedArray.length];

        for (int i = 0; i < splittedArray.length; i++) {        // takes each splited number and puts it to new array
            arr[i] = Integer.parseInt(splittedArray[i]);
        }
        array = arr;
    }

    /*
    @outputReverse - prints reversed array elements
    @n - number of elements in the array
    @array - array of numbers
 */
    public static void outputReverse(int n, int[] array) {
        if (n == 0) {        // if 0 elements exits the function
            return;
        }
        System.out.print(array[n - 1] + " ");
        outputReverse(n - 1, array);
    }
}
