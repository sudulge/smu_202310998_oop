import java.util.Scanner;

class BankAccount {
    int balance; 
    
    BankAccount(int balance) {
        this.balance = balance; 
    }
    
    void deposit(int amount) {
        this.balance += amount;
        return;
    }
    
    void withdraw(int amount) {
        if (this.balance - amount < 0) {
            System.out.println("잔액 부족, 출금 실패");
            return ;
        }
        else {
            this.balance -= amount;
            return;
        }
    }
    
    int getBalance() {
        return this.balance;
    }
}

class MP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000);

        for (int i = 0; i < 3; i++) {
            System.out.println("입금/출금 입력");
            String operation = sc.next();
            System.out.printf("%s 할 금액 입력\n", operation);
            int amount = sc.nextInt();

            if (operation.equals("입금")) {
                account.deposit(amount);
            }
            else if (operation.equals("출금")) {
                account.withdraw(amount);
            }
            System.out.printf("잔액: %d\n", account.getBalance());
        }
    }   
}