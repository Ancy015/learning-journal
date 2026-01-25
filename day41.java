class PrimeNumbersBetween {


    static void printPrimes(int start, int end) {

        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public static void main(String args[]) {

        int start = 10;
        int end = 30;

        System.out.print("Prime Numbers: ");
        printPrimes(start, end);
    }
}


