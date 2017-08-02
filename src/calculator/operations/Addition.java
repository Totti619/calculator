package calculator.operations;

public class Addition extends Operation {
    public Addition(){super();}
    public Addition(Double number1, Double number2) {
        super(number1, number2);
    }

    @Override
    public Double operate() {
        return getNumber1() + getNumber2();
    }
}
