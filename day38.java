
class PythagoreanTriplet {


    static void checkTriplet(int a, int b, int c) {
        if ((a * a + b * b) == (c * c)) {
            System.out.println("It is a Pythagorean Triplet");
        } else {
            System.out.println("It is NOT a Pythagorean Triplet");
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        
        checkTriplet(a, b, c);
    }
}
