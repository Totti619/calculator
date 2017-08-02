package calculator.operations;

/**
 *  @author Antonio Ortiz
 */

public class Multiplication extends Operation {
    public Multiplication(){super();}
    public Multiplication(Double number1, Double number2) {
        super(number1, number2);
    }

    @Override
    public Double operate() {
        return getNumber1() * getNumber2();
    }
}
