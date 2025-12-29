class AnnualDepreciationValue {

    public static void main(String args[]) {

        double costPrice = 80000;
        double salvageValue = 6000;
        int usefulLife = 5;

        double annualDepreciation = (costPrice - salvageValue) / usefulLife;

        System.out.println("Annual Depreciation = " + annualDepreciation);
    }
}
