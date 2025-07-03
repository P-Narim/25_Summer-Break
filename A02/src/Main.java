import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius temperature > ");
        double c_degree = sc.nextDouble(); //섭씨 온도
        double f_degree = c_degree * 1.8 + 32; //화씨 온도

        System.out.print("Fahrenheit temperature is ");
        System.out.printf("%.1f", f_degree);
    }
}