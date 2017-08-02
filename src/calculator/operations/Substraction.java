package calculator.operations;

/**
 *  @author Antonio Ortiz
 */

public class Substraction extends Operation {
    public Substraction(){super();}
    public Substraction(Double number1, Double number2) {
        super(number1, number2);
    }

    @Override
    public Double operate() {
        return getNumber1() - getNumber2();
    }
}
