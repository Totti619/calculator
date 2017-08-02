package calculator.operations;

/**
 *  @author Antonio Ortiz
 */

public abstract class Operation {
    Double number1, number2;
    public Operation(){}
    public Operation(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double getNumber1() {
        return number1;
    }
    public void setNumber1(Double number1) {
        this.number1 = number1;
    }
    public Double getNumber2() {
        return number2;
    }
    public void setNumber2(Double number2) {
        this.number2 = number2;
    }
    
    
    /**
     *  @return the result of the operation
     */
    public abstract Double operate();
}
