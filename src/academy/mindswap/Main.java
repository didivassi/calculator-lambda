package academy.mindswap;

import academy.mindswap.calculator.Calculator;
import academy.mindswap.calculator.DefinedOperations;
import academy.mindswap.calculator.Operation;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculator c = new Calculator();
        Operation sum=((num1, num2) -> num1+num2);
        Operation minus=((num1, num2) -> num1-num2);
        Operation multiply=((num1, num2) -> num1*num2);
        Operation divide=((num1, num2) -> {
           if(num2==0){
               throw new ArithmeticException("Can't divide by zero");
           }
            return num1*num2;
        });

        System.out.println(c.calculate(sum, 3, 4));
        System.out.println(c.calculate(minus, 3, 4));
        System.out.println(c.calculate(multiply, 3, 4));
        System.out.println(c.calculate(divide, 3, 4));

   //     System.out.println(c.calculate(divide, 3, 0));

        System.out.println(c.calculate(DefinedOperations.sum, 3, 4));
        System.out.println(c.calculate(DefinedOperations.minus, 3, 4));
        System.out.println(c.calculate(DefinedOperations.multiply, 3, 4));
        System.out.println(c.calculate(DefinedOperations.divide, 3, 4));
        System.out.println(c.calculate(((num1, num2) -> num1%num2), 3, 4));

        List<Integer> array= Arrays.asList(3,5,6,7);

        //array.forEach(n-> n=3);
       // array.forEach(n-> n.);
        array.forEach(n-> System.out.println(n));


    }
}
