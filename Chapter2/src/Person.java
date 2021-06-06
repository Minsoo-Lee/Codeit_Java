public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        this.age = age;
        this.cashAmount = cashAmount;
    }

    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
        cashAmount = 0;
    }

    public void setAccount(BankAccount account) { this.account = account;}
    public BankAccount getAccount() { return account; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setCashAmount(int cashAmount) { this.cashAmount = cashAmount;}
    public int getCashAmount() { return cashAmount; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
