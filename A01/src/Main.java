import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a birth year > ");
        int birth_year = sc.nextInt(); // 태어난 년도
        int age = 2025 - birth_year; // 나이

        System.out.println("You are " + age + " year's old.");
    }
}