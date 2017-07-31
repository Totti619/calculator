/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.operations;

/**
 *
 * @author Master
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getNumber1() + " x " + getNumber2() + " = " + operate();
    }
}
