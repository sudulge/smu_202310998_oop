public class MP03_2 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int n1 = i/1000;
            int n2 = i%1000 / 100;
            int n3 = i%100 / 10;
            int n4 = i%10;
            if (n1*n1*n1*n1 + n2*n2*n2*n2 + n3*n3*n3*n3 + n4*n4*n4*n4 == i) {
                System.out.println(i);
            }
        }
    }
}
