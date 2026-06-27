import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double ft = 30.48;
        double total = 0;
        total = N * ft; 

        System.out.printf("%.1f", total);

    }
}