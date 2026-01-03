class PrincpleInterest {

    public static void main(String args[]) {

        double Principal = 40000;
        int Rate = 5;
        int Time = 2;

        double Amount = Principal * Math.pow((1 + (double) Rate / 100), Time);
        double CompoundInterest = Amount - Principal;

        System.out.println("compound interest=" + CompoundInterest);
    }
}


