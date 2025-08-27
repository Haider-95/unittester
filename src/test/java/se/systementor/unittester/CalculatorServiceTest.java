package se.systementor.unittester;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.systementor.unittester.services.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService sut;

    @BeforeEach
    void setUp() {
        sut = new CalculatorService();

    }

    @Test
    void testAddOperation() {

        int tal1 = 12;
        int tal2 = 2;
        String action = "add";

        float expected = sut.Calculate(tal1, tal2, action);
        assertEquals(14, expected, "Addition should work correctly.");
    }

    @Test
    void testSubOperation() {

        int tal1 = 12;
        int tal2 = 2;
        String action = "subtract";

        float expected = sut.Calculate(tal1, tal2, action);
        assertEquals(10, expected, "Subtraction should work correctly.");
    }

    @Test
    void testmultiOperation() {

        int tal1 = 12;
        int tal2 = 2;
        String action = "multiply";

        float expected = sut.Calculate(tal1, tal2, action);
        assertEquals(24, expected, "Multiplication should work correctly.");
    }

    @Test
    void testDivOperation() {

        int tal1 = 12;
        int tal2 = 2;
        String action = "divide";

        float expected = sut.Calculate(tal1, tal2, action);
        assertEquals(6, expected, "Division should work correctly.");
    }

    @Test
    void testInvalidActionShouldThrowException(){
        int tal1 = 100;
        int tal2 = 10;
        String action = "lkajsdkfjlöadskjlöajkfd";
        float expected = sut.Calculate(tal1, tal2, action);
    }

}
