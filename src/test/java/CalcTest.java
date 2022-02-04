import dev.nilswitt.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    void additionTest() {
        Random rand = new Random();

        double n1 = rand.nextInt();
        double n2 = rand.nextInt();
        assertEquals(n1 + n2, Calculator.calc(n1, n2, "+"));

    }

    @Test
    void subtractionTest() {
        Random rand = new Random();

        double n1 = rand.nextInt();
        double n2 = rand.nextInt();
        assertEquals(n1 - n2, Calculator.calc(n1, n2, "-"));
    }

    @Test
    void multiplicationTest() {
        Random rand = new Random();

        double n1 = rand.nextInt();
        double n2 = rand.nextInt();
        assertEquals(n1 * n2, Calculator.calc(n1, n2, "*"));

    }

    @Test
    void devisionTest() {
        Random rand = new Random();

        double n1 = rand.nextInt();
        double n2 = rand.nextInt();
        assertEquals(n1 / n2, Calculator.calc(n1, n2, "/"));
    }
}
