import java.util.Scanner;

public class MP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a를 입력하세요");
        int a = sc.nextInt();
        System.out.printf("면적 = %f\n", Math.sqrt(3.0)*a*a/4);

        System.out.println("x1, y1, x2를 입력하세요");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();

        a = x2 - x1;
        double x3 = x2 + a/2;
        double y2 = y1 + Math.sqrt(3.0)*a/2;
        System.out.printf("면적 = %f\n", Math.sqrt(3.0)*a*a/4);
        System.out.printf("x3: %f, y2: %f", x3, y2);
    }
}
