package ua.kpi.training;

/**
 * Created by Kirill on 19.04.2017.
 */
public enum TestSequenceOfNumbers {
    FIRST_NUMBER(116), SECOND_NUMBER(54), THIRD_NUMBER(58), FOURTH_NUMBER(21), FIFTH_NUMBER(17),
    SIXTH_NUMBER(39), SEVENTH_NUMBER(29), EIGTH_NUMBER(26), NINTH_NUMBER(35), TENRH_NUMBER(33);

    private final int value;

    TestSequenceOfNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
