package ua.kpi.training;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kirill on 15.04.2017.
 */
public class ModelTest {
    @Test
    public void checkForRandomValueSix() {
        int minBarrier = 6;
        int maxBarrier = 6;
        int expectedValue = 6;

        int actualRandValue;
        Model model = new Model();
        actualRandValue = model.randValue(minBarrier, maxBarrier);
        assertEquals(expectedValue, actualRandValue);
    }

    @Test
    public void checkForDiapasoneValue() {
        int minBarrier = 0;
        int maxBarrier = 100;
        int counterTest = 100000;

        int actualRandValue;
        Model model = new Model();
        for (int i = 0; i < counterTest; i++) {
            actualRandValue = model.randValue(minBarrier, maxBarrier);
            assertTrue(actualRandValue >= minBarrier && actualRandValue <= maxBarrier);
        }
    }

    @Test
    public void testCheckValueTrue() {
        int valueFromUser = 21;
        int secretValue = 21;
        boolean expectedValue = true;

        boolean actualValue;
        Model model = new Model();
        model.setSecretValue(secretValue);
        actualValue = model.checkValue(valueFromUser);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCheckValueLarger() {
        int valueFromUser = 37;
        int secretValue = 21;
        boolean expectedValue = false;

        boolean actualValue;
        Model model = new Model();
        model.setSecretValue(secretValue);
        actualValue = model.checkValue(valueFromUser);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCheckValueLess() {
        int valueFromUser = 12;
        int secretValue = 21;
        boolean expectedValue = false;

        boolean actualValue;
        Model model = new Model();
        model.setSecretValue(secretValue);
        actualValue = model.checkValue(valueFromUser);
        assertEquals(expectedValue, actualValue);
    }

    @Test(timeout = 1000)
    public void testCkeckController() {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        model.setSecretValue(TestSequenceOfNumbers.TENRH_NUMBER.getValue());

        while (!model.checkValue(controller.getValueFromUserByEnum())) ;


    }
}