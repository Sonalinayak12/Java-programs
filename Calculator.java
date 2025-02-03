

package math_operations;

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
System.out.println("Cannot divide by zero!");
return Double.NaN; // NaN (Not a Number) for an undefined result
}
}
}
package math_operations;
public class MathUtils {
public double calculateSquareRoot(double num) {
if (num >= 0) {
return Math.sqrt(num);
} else {
System.out.println("Cannot calculate square root of a negative number!");
return Double.NaN; // NaN (Not a Number) for an undefined result
}
}
}
public class MathOperationsApp {
    public static void main(String[] args) {
math_operations.Calculator calculator = new math_operations.Calculator();
math_operations.MathUtils mathUtils = new math_operations.MathUtils();
System.out.println("Addition: " + calculator.add(5, 3));
System.out.println("Subtraction: " + calculator.subtract(8, 4));
System.out.println("Multiplication: " + calculator.multiply(2, 6));
System.out.println("Division: " + calculator.divide(10, 2));
System.out.println("Square Root: " + mathUtils.calculateSquareRoot(25));
System.out.println("Square Root of -9: " + mathUtils.calculateSquareRoot(-9));