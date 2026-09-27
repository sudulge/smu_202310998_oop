import java.util.Scanner;

public class MP03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deduction = 0.0;
        double tax = 0.0;

        System.out.println("총 금여액 입력: ");
        long salary = sc.nextLong();
        System.out.println("신용카드 사용 금액 입력: ");
        int credit = sc.nextInt();
        System.out.println("전통시장 사용 금액 입력: ");
        int traditional = sc.nextInt();
        System.out.println("문화비 사용 금액 입력: ");
        int culture = sc.nextInt();
        System.out.println("교통비 사용 금액 입력");
        int transport = sc.nextInt();

        credit = credit - traditional - culture - transport;

        if (credit > salary*0.25) {
            deduction += (credit - salary*0.25) * 0.15;
        }
        deduction += traditional*0.3;
        deduction += transport*0.3;
        if (salary <= 70000000) {
            if (culture * 0.3 > 1000000) {
                deduction += 1000000.0;
            }
            else {
                deduction += culture * 0.3;
            }
        } 
        salary -= deduction;

        if (salary <= 14000000) {
            tax = salary*0.06;
        }
        else if (salary <= 50000000) {
            tax = salary * 0.15 - 1260000;
        }
        else if (salary <= 88000000) {
            tax = salary * 0.24 - 5760000;
        }
        else if (salary <= 150000000) {
            tax = salary * 0.35 - 15440000;
        }

        System.out.println(tax);
    }
}