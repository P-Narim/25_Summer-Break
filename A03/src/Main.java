import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of Rectangle > ");
        int width = sc.nextInt(); // 가로크기
        System.out.print("Enter height of Rectangle > ");
        int height = sc.nextInt(); // 세로크기
        int area = width * height; // 직사각형의 넓이

        System.out.println("Area of Rectangle is " + area);
    }
}