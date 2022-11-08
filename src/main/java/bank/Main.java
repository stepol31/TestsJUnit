package bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100_000, "Сберегательный счет");
        CreditAccount creditAccount = new CreditAccount(0, "Кредитный счет");
        CheckingAccount checkingAccount = new CheckingAccount(300_000, "Расчетный счет");

        savingsAccount.transfer(checkingAccount, 50_000);
        System.out.println();
        checkingAccount.pay(20000);
        System.out.println();
        checkingAccount.pay(500000);
        System.out.println();
        savingsAccount.transfer(creditAccount, 60000);
        System.out.println();
        creditAccount.pay(50000);
        System.out.println();
        creditAccount.addMoney(50000);
        System.out.println();
        creditAccount.addMoney(2000);
        System.out.println();
        savingsAccount.pay(400);


    }
}
