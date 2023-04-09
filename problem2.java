import java.util.Scanner;

public class problem2 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int[] array;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        inputArray();
        System.out.println(findAverage(n, array));
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
    @findAverage - find average value in the array of numbers
    @n - number of elements in the array
    @array - array of numbers
    @return - average
 */
    private static double findAverage(int n, int[] array) {
        if (n == 0) {                   // if 0 elements in the array
            return 0;
        } else {                        // in other case
            double sum = findAverage(n - 1, array) * (n - 1) + array[n - 1];
            return sum / n;
        }
    }



}
