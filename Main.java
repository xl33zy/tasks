import java.util.*;

public class Main {
    static String problemNum;

    /*
    @main - solves problem tasks
    @args - command-line arguments
 */
    public static void main(String[] args) {
        inputProblemNum();
        solveProblem();
    }

    /*
    @inputProblemNum - takes user's input of problem number
 */
    private static void inputProblemNum() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of problem to solve: ");
        problemNum = sc.nextLine();
    }

    /*
    @solveProblem - solves chosen problem
 */
    private static void solveProblem() {
        switch (problemNum) {                   // checks what problem number was given and solves the corresponding problem
            case "1": Problem1.solve();
            case "2": Problem2.solve();
            case "3": Problem3.solve();
            case "4": Problem4.solve();
            case "5": Problem5.solve();
            case "6": Problem6.solve();
            case "7": Problem7.solve();
            case "8": Problem8.solve();
            case "9": Problem9.solve();
            case "10": Problem10.solve();
        }
    }
}
