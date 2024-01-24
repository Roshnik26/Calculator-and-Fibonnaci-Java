public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public double varianceArray(int[] array) {
        int sum = 0;
        int sumSquared = 0;

        for (int num : array) {
            sum += num;
            sumSquared += num * num;
        }

        int n = array.length;
        double mean = (double) sum / n;
        double meanSquared = mean * mean;

        return (sumSquared - n * meanSquared) / (n - 1);
    }

    public double standardDeviationArray(int[] array) {
        return Math.sqrt(varianceArray(array));
    }
}

