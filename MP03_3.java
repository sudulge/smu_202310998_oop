public class MP03_3 {
    public static void main(String[] args) {
        int a1 = 1;
        while (a1*a1*a1*a1 <= 10000) {
            a1++;
        }
        System.out.println(a1);
        
        int a2 = 1;
        while (true) {
            System.out.println(a2*a2*a2);
            if (a2*a2*a2 > 100) {
                break;
            }
            a2++;
        }
    }    
}