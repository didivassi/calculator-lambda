package academy.mindswap.calculator;

public class Calculator {

    public double calculate(Operation operation, double num1,double num2){
        return operation.doOperation(num1,num2);
    }

}
