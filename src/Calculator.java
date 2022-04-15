public class Calculator {

/*
This is a basic calculator.
It calculates simple mathematics equations like +,-,*,\ and modulo (%).
It was created by Mohamed in 2022.
*/

    // Q2 Calculator constructor
    public Calculator() {

    }

    // All methods add until modulo Q3 - Q13
    // Q3 Q4 Q5
    public int add(int a, int b) {
        return a+b;
    }
    // Q6 Q7
    public int subtract(int a, int b) {
        return a - b;
    }
    // Q8 Q9
    public int multiply(int a, int b) {
        return a*b;
    }
    // Q10 Q11
    public int divide(int a, int b) {
        return a / b;
    }

    // Q12 Q13
    public int modulo(int a, int b) {
        return a%b;
    }

    // Q14 Q15
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Q16
        int addition = myCalculator.add(5, 7);
        System.out.println(addition);

        // Q17
        int subtraction = myCalculator.subtract(45, 11);
        System.out.println(subtraction);

        // one more for good luck!
        int remainder = myCalculator.modulo(17, 3);
        System.out.println(remainder);

        // etc.. etc..
    }
}
