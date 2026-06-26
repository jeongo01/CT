public class Main {
    public static void main(String[] args) {
        double ft = 9.2;
        double mi = 1.3;

        double ftcm = ft * 30.48;
        double micm = mi * 160934;

        System.out.printf("%.1fft = %.1fcm\n", ft, ftcm);
        System.out.printf("%.1fmi = %.1fcm", mi, micm);
    }
}