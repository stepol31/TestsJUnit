package bank;

public abstract class Account {
    protected int amount;
    protected String name;

    public Account(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int pay(int amount) {
        this.amount -= amount;
        return amount;
    }

    public int transfer(Account account, int amount) {
        this.amount -= amount;
        return amount;
    }

    public int addMoney(int amount) {
        this.amount += amount;
        return amount;
    }

    @Override
    public String toString() {
        return name;
    }
}
