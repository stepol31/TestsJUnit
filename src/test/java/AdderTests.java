import org.junit.jupiter.api.Assertions;

public class AdderTests {

    @org.junit.jupiter.api.Test
    public void testSum() {
        // given:
        int a = 1, b = 2, c = 3, expected = 6;
        Adder adder = new Adder();
        // when:
        int result = Adder.sum(a, b, c);

        // then:
        Assertions.assertEquals(expected, result);

    }
}
