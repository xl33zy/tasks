import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of problem to solve: ");
        String problemNum = sc.nextLine();
        switch (problemNum) {
            case "1": Problem1.solve();
            case "2": Problem2.solve();
            case "3": Problem3.solve();
            case "4": Problem4.solve();
            case "5": Problem5.solve();
            case "6": Problem6.solve();
//            case "7": Problem7.solve();
//            case "8": Problem8.solve();
//            case "9": Problem9.solve();
//            case "10": Problem10.solve();
        }
    }
}
