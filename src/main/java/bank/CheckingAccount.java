package bank;

public class CheckingAccount extends Account {
    public CheckingAccount(int amount, String name) {
        super(amount, name);
    }

    int sum = amount;

    @Override
    public int pay(int amount) {
        if (sum - amount > 0) {
            System.out.println("C " + name + " оплачено " + amount);
            sum -= amount;
            System.out.println("Баланс " + name + " составляет: " + sum);
        } else {
            System.out.println("Баланс " + name + " не может быть меньше 0");
        }
        return sum;
    }

    @Override
    public int transfer(Account account, int amount) {
        if (sum - amount > 0) {
            System.out.println("Cо " + name + " переведено " + amount + " на " + account);
            sum -= amount;
            System.out.println("Баланс " + name + " составляет: " + sum);
            account.addMoney(amount);
        } else {
            System.out.println("Баланс " + " не может быть меньше 0");
        }
        return sum;
    }

    @Override
    public int addMoney(int amount) {
        System.out.println(name + " пополнен на сумму: " + amount);
        sum += amount;
        System.out.println("Баланс " + name + " составляет " + sum);
        return sum;
    }
}
