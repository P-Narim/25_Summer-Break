import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file size as gigabytes > ");
        int gigabytes = sc.nextInt(); //용량(기가바이트 단위)
        int megabytes = gigabytes * 1024; // 용량(메가바이트 단위)
        int kilobytes = megabytes * 1024; // 용량(킬로바이트 단위)
        long bytes = (long)kilobytes * 1024; // 용량(바이트 단위)

        System.out.println("Your file size is");
        System.out.println(gigabytes + " MB");
        System.out.println(megabytes + " KB");
        System.out.println(kilobytes + " B");
    }
}