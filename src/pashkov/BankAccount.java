package pashkov;

public class BankAccount {

    private final String name;
    private double count;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public void add(double money) {
        setCount(money * 0.995);
    }

    public void transfer(BankAccount otherPerson, double money) {
        setCount(count - money);
        otherPerson.setCount(money * 0.99);
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }
}
