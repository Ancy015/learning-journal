
public class PythagoreanTripletCheck {

    // Method to check Pythagorean triplet
    public static void checkPythagoreanTriplet(int a, int b, int c) {
        // First, find the largest number to consider as hypotenuse
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = 0;

        if (max == a) {
            sumOfSquares = b * b + c * c;
            if (a * a == sumOfSquares) {
                System.out.println("It is a Pythagorean Triplet");
                return;
            }
        } else if (max == b) {
            sumOfSquares = a * a + c * c;
            if (b * b == sumOfSquares) {
                System.out.println("It is a Pythagorean Triplet");
                return;
            }
        } else {
            sumOfSquares = a * a + b * b;
            if (c * c == sumOfSquares) {
                System.out.println("It is a Pythagorean Triplet");
                return;
            }
        }

        System.out.println("It is not a Pythagorean Triplet");
    }

    public static void main(String[] args) {
        int a = 3, b = 4, c = 5; // Hardcoded numbers
        checkPythagoreanTriplet(a, b, c);
    }
}