class FutureInvestment {
    public static void main(String args[]) {

        double value = 20000;
        int interest = 3;
        int t = 3;

        double futureValue = value * Math.pow((1 + (double)interest / 100), t);

        System.out.println("Future value = " + futureValue);
    }
}

