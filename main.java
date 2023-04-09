import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of problem to solve: ");
        String problemNum = sc.nextLine();
        switch (problemNum) {
            case "1": problem1.solve();
            case "2": problem2.solve();
            case "3": problem3.solve();
//            case "4": problem4.solve();
//            case "5": problem5.solve();
//            case "6": problem6.solve();
//            case "7": problem7.solve();
//            case "8": problem8.solve();
//            case "9": problem9.solve();
//            case "10": problem10.solve();
        }
    }
}
