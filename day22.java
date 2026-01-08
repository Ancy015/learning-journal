class NumberSum {
    public static void main(String args[]) {

        int numbers[] = {-5, 10, 3, -2, 8, 7, 0};

        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                break;   
            }

            if (numbers[i] < 0) {
                negSum = negSum + numbers[i];
            } else if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                posEvenSum = posEvenSum + numbers[i];
            } else if (numbers[i] > 0 && numbers[i] % 2 != 0) {
                posOddSum = posOddSum + numbers[i];
            }
        }

        System.out.println("Sum of Negative Numbers = " + negSum);
        System.out.println("Sum of Positive Even Numbers = " + posEvenSum);
        System.out.println("Sum of Positive Odd Numbers = " + posOddSum);
    }
}

