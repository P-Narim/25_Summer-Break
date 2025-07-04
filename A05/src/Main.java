import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days > ");
        int days = sc.nextInt(); // 날 수
        int seconds = days * 24 * 60 * 60; // 초 단위 시간

        System.out.println("Total seconds is " + seconds);
    }
}