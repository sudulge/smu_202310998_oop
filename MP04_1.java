public class MP04_1 {

    static int countchar(String str, char c) {
        int cnt = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == c) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n;
        n = countchar(args[0], 'n');
        System.out.println(n);
    }
}
