import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year = sc.nextInt(); //태어난 년도
        int age = 2025 - birth_year; // 나이

       if(age >= 20) {
           System.out.println("You are adult");
       }
    }
}