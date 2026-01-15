public class ProgramFactorial {
    static int Factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; 
        int factorialResult = Factorial(number);

        System.out.println("Factorial of " + number + " = " + factorialResult);
    }
}
