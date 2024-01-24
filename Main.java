
public class Main {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(5, 3));

        System.out.println("Subtraction: " + calculator.subtract(8, 2));

        System.out.println("Multiplication: " + calculator.multiply(4, 6));

        System.out.println("Division: " + calculator.divide(10, 2));

        int[] numbers = UserInput.getArrayInput();
        System.out.println("Sum of Array: " + calculator.sumArray(numbers));

        System.out.println("Variance of Array: " + calculator.varianceArray(numbers));

        System.out.println("Standard Deviation of Array: " + calculator.standardDeviationArray(numbers));
    }
}

