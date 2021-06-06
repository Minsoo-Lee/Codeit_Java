public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
//        Person p1 = new Person();
//        p1.setName("김신의");
//        p1.setAge(28);
//        p1.setCashAmount(30000);

        Person p1 = new Person("김신의", 28, 30000);

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // 3 - 4. write code here
        Person p2 = new Person("이민수", 28);
        System.out.println(p2.getName());
        System.out.println(p2.getCashAmount());

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

    }
}