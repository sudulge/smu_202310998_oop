import java.util.Scanner;

public class MP04_2 {
    static String reverse(String s) {
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length()-i-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println(result);
    }
}
