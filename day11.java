class Average {
    public static void main(String args[]) {

        int[] N = {10, 20, 30, 40, 50};
        int n = N.length;
        int sum = 0;
        int average;

        for (int i = 0; i < n; i++) {
            sum = sum + N[i];
        }

        average = sum / n;

        System.out.println("The average of N numbers = " + average);
    }
}

