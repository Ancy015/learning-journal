public class PrimeNumberCheck {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int number = 17;

        
        PrimeNumberCheck obj1 = new PrimeNumberCheck();

        // Method call using object
        if (obj1.isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}