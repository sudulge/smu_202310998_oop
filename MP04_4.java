import java.util.Scanner;

public class MP04_4 {

    static void printWords(String[] words, char[] chars) {
        for (String s: words) {
            for (char c: chars) {
                if (s.indexOf(c) != -1) {
                    System.out.println(s);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "In blandit lacus ac sapien dictum, elementum " +
                    "fringilla sem varius. Vestibulum consecteturb " +
                    "metus at felis porttitor, a rhoncus neque " +
                    "consectetur. Integer vehicula felis non metus " +
                    "eleifend, in blandit risus ullamcorper. Phasellus " +
                    "mauris nisi, facilisis et quam placerat, congue " +
                    "venenatis diam. Praesent in erat odio. Phasellus " +
                    "sit amet efficitur sem. Ut quis mi venenatis,  " +
                    "feugiat justo eu, rhoncus velit. Suspendisse " +
                    "iaculis tempus sapien. Integer mauris neque,  " +
                    "posuere sed mi at, aliquet facilisis nibh. Cras " +
                    "vel blandit lorem. Aliquam suscipit, nisl id  " +
                    "condimentum condimentum, purus magna maximus sem,  " +
                    "vitae vehicula diam nisi ac enim.";

        String[] splitedstr = str.split(" ");

        char[] chars = new char[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            char c = sc.nextLine().charAt(0);
            chars[i] = c;
        }

        printWords(splitedstr, chars);
    }
}
