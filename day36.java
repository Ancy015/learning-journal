class EvenNaturalNumber {

    
    static int sumOfEvenNumbers(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; 

        int result = sumOfEvenNumbers(n);
        System.out.println("Sum of even natural numbers up to " + n + " = " + result);
    }
}

