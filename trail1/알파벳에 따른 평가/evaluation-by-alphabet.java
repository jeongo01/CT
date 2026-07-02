import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        if (N.equals("S")) {
            System.out.println("Superior");
        } else if (N.equals("A")) {
            System.out.println("Excellent");
        } else if (N.equals("B")) {
            System.out.println("Good");
        } else if (N.equals("C")) {
            System.out.println("Usually");
        } else if (N.equals("D")){
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}