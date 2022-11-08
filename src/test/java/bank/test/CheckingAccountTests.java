package bank.test;

import bank.Account;
import bank.CheckingAccount;
import bank.CreditAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CheckingAccountTests {
    CheckingAccount checkingAccount = new CheckingAccount(300000, "Расчетный счет");
    Account account;

    @BeforeAll
    public static void startAllTests() {
        System.out.println("Стартовали тесты");
    }

    @AfterAll
    public static void finishAllTests() {
        System.out.println("Тесты завершились");
    }

    @Test
    public void testPay() {
        // given:

        int sum = 20000, expected = 280000;

        // when:
        int result = checkingAccount.pay(sum);

        // then:
        Assertions.assertEquals(expected, result);


    }

    @Test
    public void testTransfer() {

        // given:
        int sum = 10000, expected = 290000;
        account = new CreditAccount(10000, "Кредитный счет");

        // when:
        int result = checkingAccount.transfer(account, sum);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @MethodSource("source")
    @ParameterizedTest
    public void testAddMoney(int amount, int expected) {
        int result = checkingAccount.addMoney(amount);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> source() {
        return Stream.of(Arguments.of(5000, 305000));
    }


}
