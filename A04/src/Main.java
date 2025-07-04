import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of Apartment(m^2) > ");
        double m2_area = sc.nextDouble(); // 면적 (제곱미터)
        double pyung_area = m2_area / 3.305; // 면적 (평수)

        System.out.printf("Area of Apartment(평수) %.1f", pyung_area);
    }
}