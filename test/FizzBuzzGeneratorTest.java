import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzGeneratorTest {

    private FizzBuzzGenerator fizzBuzzGenerator;

    @BeforeEach
    public void init() {
        this.fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @Test
    public void divisibleBy_PositiveValues_True() {
        int numerator = 4;
        int denominator = 2;
        boolean actual;

        actual = this.fizzBuzzGenerator.divisibleBy(numerator, denominator);

        assertTrue(actual);
    }

    @Test
    public void divisibleBy_PositiveValues_False() {
        int numerator = 3;
        int denominator = 2;
        boolean actual;

        actual = this.fizzBuzzGenerator.divisibleBy(numerator, denominator);

        assertFalse(actual);
    }

    @Test
    public void divisibleBy_NegativeValues_True() {
        int numerator = -9;
        int denominator = -3;
        boolean actual;

        actual = this.fizzBuzzGenerator.divisibleBy(numerator, denominator);

        assertTrue(actual);
    }

    @Test
    public void divisibleBy_NegativeValueAs1stParam_True() {
        int numerator = -6;
        int denominator = 2;
        boolean actual;

        actual = this.fizzBuzzGenerator.divisibleBy(numerator, denominator);

        assertTrue(actual);
    }

    @Test
    public void FizzBuzz_PositiveValues() {
        int startNumber = 1;
        int endNumber = 15;
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        List<String> actual = this.fizzBuzzGenerator.FizzBuzz(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void FizzBuzz_NegativeValues() {
        int startNumber = -10;
        int endNumber = -1;
        List<String> expected = Arrays.asList("Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1");

        List<String> actual = this.fizzBuzzGenerator.FizzBuzz(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void FizzBuzz_NegativeToPositiveValues() {
        int startNumber = -5;
        int endNumber = 5;
        List<String> expected = Arrays.asList("Buzz", "-4", "Fizz", "-2", "-1", "FizzBuzz", "1", "2", "Fizz", "4", "Buzz");

        List<String> actual = this.fizzBuzzGenerator.FizzBuzz(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void FizzBuzz_ZeroAndZero() {
        int startNumber = 0;
        int endNumber = 0;
        List<String> expected = Arrays.asList("FizzBuzz");

        List<String> actual = this.fizzBuzzGenerator.FizzBuzz(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void FizzBuzz_NonConsecutiveNumbers_ErrorMessage() {
        int startNumber = 7;
        int endNumber = 1;
        List<String> expected = Arrays.asList("Error: Start number must be larger than end number");

        List<String> actual = this.fizzBuzzGenerator.FizzBuzz(startNumber, endNumber);

        assertEquals(expected, actual);
    }
}
