package Exercise;

/* Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9 as input
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9.";
    }
    @Override
    public String getMessage() {
        return "I am getMessaged()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString() {
        return "Cannot divide by 0";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString() {
        return "Max input for Multiplication cant be greater than 7000.";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    double Subtraction(double a, double b) throws MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b)throws MaxInputException, MaxMultiplyInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException(); 
        }
        return a/b;
    }
}

public class Ex5_CustomCalculator{
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator calc = new CustomCalculator();
        // System.out.println("Addition: " + calc.add(8, 9));
        // System.out.println("Division: " + calc.divide(7, 0));
        // System.out.println("Division: " + calc.divide(7000000, 7));
        // System.out.println("Multiplication: " + calc.multiply(13, 8000));
        // System.out.println("Subtraction: " + calc.Subtraction(10000000, 7));

        System.out.println("Addition: " + calc.add(7, 7));
        System.out.println("Division: " + calc.divide(7, 7));
        System.out.println("Division: " + calc.divide(70, 7));
        System.out.println("Multiplication: " + calc.multiply(13, 2));
        System.out.println("Subtraction: " + calc.Subtraction(13, 7));
    }
}