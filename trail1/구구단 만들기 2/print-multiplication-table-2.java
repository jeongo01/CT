import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
  
        for(int i = 2; i < 9; i++) {
            if(i % 2 == 0) {
                for(int j = B; j >= A; j--) {
                    System.out.print(j + " * " + i + " = " + i*j);
                    if(j > A) {
                        System.out.print(" / ");
                    }
                }
                System.out.println();
            }
        }      
    }
}