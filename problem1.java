import java.util.Scanner;

public class problem1 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int[] array;

    /*
    @solve - solves the task
*/
    public static void solve() {
        inputN();
        inputArray();
        System.out.println(findMinimum(n, array));
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
    @findMinimum - finds minimum value in the array of numbers
    @n - number of elements in the array
    @array - array of numbers
    @minimum - minimum value in the array of numbers
 */
    private static int findMinimum(int n, int[] array) {
        if (n == 1) {                   // if array has one element return it
            return array[0];
        }
        int minimum = findMinimum(n - 1, array);
        if (array[n - 1] < minimum) {       // compare the last element of array with the minimum
            minimum = array[n - 1];
        }
        return minimum;
    }
}
