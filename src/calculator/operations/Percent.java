package calculator.operations;

/**
 *  @author Antonio Ortiz
 */

public class Percent extends Operation {
    public Percent(){
        super();
        setNumber2((double)100);
    }
    @Override
    public Double operate() {
        return getNumber1() / 100; 
    }
}
