# Calculator-and-Fibonnaci-Java

In Fibonacci.java:
main(String[] args) method: The main method is the entry point of the program. It initializes the value of 'n' and prints the Fibonacci series by calling the fibonacci method in a loop.
fibonacci(int n) method: This is a recursive function to calculate the nth Fibonacci number. It returns the value of the Fibonacci number at index 'n'. The base case is when 'n' is 0 or 1, in which case it returns 'n'. Otherwise, it recursively calculates the sum of the previous two Fibonacci numbers

In Main.java:
main(String[] args) method: The main method for the Calculator program. It demonstrates the usage of the Calculator class by performing various arithmetic operations and array-related calculations.

In UserInput.java:
getNumberInput(String message) method: This method takes a message as input, prints the message, and then reads an integer input from the user using the Scanner class. It returns the entered integer.
getArrayInput() method: This method prompts the user to enter the size of an array and the elements of the array. It returns an array of integers based on user input.

In Calculator.java:
Arithmetic operation methods:
add(int a, int b) method: Adds two integers and returns the result.
subtract(int a, int b) method: Subtracts the second integer from the first and returns the result.
multiply(int a, int b) method: Multiplies two integers and returns the result.
divide(int a, int b) method: Divides the first integer by the second (non-zero) and returns the result.
Array-related calculation methods:
sumArray(int[] array) method: Calculates the sum of an array of integers and returns the result.
varianceArray(int[] array) method: Calculates the variance of an array of integers and returns the result.
standardDeviationArray(int[] array) method: Calculates the standard deviation of an array of integers and returns the result.
