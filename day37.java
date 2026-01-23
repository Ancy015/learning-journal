class CalculateEvenNaturalNumbers {

    static int calculate(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;

        int result = calculate(n);
        System.out.println("Sum of all even natural numbers up to " + n + " = " + result);
    }
}

