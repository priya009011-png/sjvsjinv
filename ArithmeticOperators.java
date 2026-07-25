import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args ) 
    {
        Scanner sc = new Scanner(System.in);
        //taking two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        //performing arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; 
        int modulus = num1 % num2;
        //displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);     
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
        sc.close();
    }
}

/* Arithmetic Operators in Java 
modulus operator (%) is used to find the remainder of a division operation. It returns the remainder after dividing the left operand by the right operand. For example, if we have 10 % 3, it will return 1 because when 10 is divided by 3, the quotient is 3 with a remainder of 1. The modulus operator is often used in programming for tasks such as determining if a number is even or odd, or for wrapping around values in circular data structures.
addition operator (+) is used to add two numbers together. It can also be used for string concatenation. For example, if we have 5 + 3, it will return 8. If we have "Hello " + "World", it will return "Hello World". The addition operator is one of the most basic and commonly used operators in programming for performing arithmetic operations and combining strings.
subtraction operator (-) is used to subtract one number from another. For example, if we have 10 - 4, it will return 6. The subtraction operator is used in programming to perform arithmetic operations and to calculate differences between values.
multiplication operator (*) is used to multiply two numbers together. For example, if we have 5 * 3, it will return 15. The multiplication operator is used in programming for performing arithmetic operations and for scaling values.
division operator (/) is used to divide one number by another. For example, if we have
10 / 2, it will return 5. The division operator is used in programming for performing arithmetic operations and for calculating ratios and averages.
10 % 3 will return 1 because when 10 is divided by 3, the quotient is 3 with a remainder of 1. The modulus operator is often used in programming for tasks such as determining if a number is even or odd, or for wrapping around values in circular data structures.
*/
