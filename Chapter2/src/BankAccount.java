public class BankAccount {
    private int balance;
    private Person owner;

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public void setBalance (int newBalance) {
        balance = newBalance;
    }

    public int getBalance () {
        return balance;
    }

    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int)(amount * exchangeRate));
    }

    public boolean deposit(int amount) {
        // 1. write code here
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    public boolean withdraw(int amount) {
        // 2. write code here
        if (amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }
}
