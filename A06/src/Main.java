import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter points of Korean > ");
        int kor = sc.nextInt(); // 국어점수
        System.out.print("Enter points of English > ");
        int eng = sc.nextInt(); // 영어점수
        System.out.print("Enter points of Math > ");
        int math = sc.nextInt(); // 수학점수
        int total = kor + eng + math; // 총점
        double average = total / 3.0; // 평균점수

        System.out.println("Total point is " + total);
        System.out.printf("The average is %.1f", average);
    }
}