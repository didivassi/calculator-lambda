package academy.mindswap.calculator;

public final class DefinedOperations {

    public static Operation sum=(Double::sum);
    public static Operation minus=((num1, num2) -> num1-num2);
    public static Operation multiply=((num1, num2) -> num1*num2);
    public static Operation divide=((num1, num2) -> {
        if(num2==0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return num1*num2;
    });
}
