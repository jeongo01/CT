import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        double b = ((10000*w) / (h*h));

        System.out.printf("%.0f\n", b);       

        if (b >= 25) {
            System.out.print("Obesity");
        }


    }
}