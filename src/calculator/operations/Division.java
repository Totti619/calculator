package calculator.operations;

/**
 *  @author Antonio Ortiz
 */

public class Division extends Operation {
    public Division(){super();}
    public Division(Double number1, Double number2) {
        super(number1, number2);
    }

    @Override
    public Double operate() {
        return getNumber1() / getNumber2();
    }
}
