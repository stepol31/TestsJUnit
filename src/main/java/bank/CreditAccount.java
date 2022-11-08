package bank;

public class CreditAccount extends Account {
    public CreditAccount(int amount, String name) {
        super(amount, name);
    }

    int sum = amount;

    @Override
    public int pay(int amount) {
        System.out.println("C " + name + " оплачено " + amount);
        sum -= amount;
        System.out.println("Баланс " + name + " составляет: " + sum);
        return amount;
    }


    @Override
    public int addMoney(int amount) {
        if (sum + amount > 0) {
            return amount;
        } else {
            sum += amount;
            System.out.println(name + " пополнен на сумму: " + amount);
            System.out.println("Баланс " + name + " составляет: " + sum);
        }
        System.out.println("Баланс " + name + " не может быть больше 0");
        return amount;
    }
}
