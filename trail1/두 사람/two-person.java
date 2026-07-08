import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        char Sex1 = sc.next().charAt(0);
        
        int age2 = sc.nextInt();
        char Sex2 = sc.next().charAt(0);

        boolean p1 = (age1 >= 19 && Sex1 == 'M');
        boolean p2 = (age2 >= 19 && Sex2 == 'M');

        if(p1 || p2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}