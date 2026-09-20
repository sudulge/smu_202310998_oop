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
            System.out.println("deposit/withdraw 입력");
            String operation = sc.next();

            if (operation.equals("deposit")) {
                int amount = sc.nextInt();
                account.deposit(amount);
            }
            else if (operation.equals("withdraw")) {
                int amount = sc.nextInt();
                account.withdraw(amount);
            }
            System.out.printf("%d\n", account.getBalance());
        }
    }   
}