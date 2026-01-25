class PythagoreanTriplet {

    void check(int a, int b, int c) {

        int value = (a ^2) + (b ^2);   

        if ((c ^2) == value) {          
            System.out.println("It is a Pythagorean Triplet");
        } else {
            System.out.println("It is not a Pythagorean Triplet");
        }
    }

    public static void main(String args[]) {

        int a = 3;                      
        int b = 4;
        int c = 5;

        PythagoreanTriplet obj1 = new PythagoreanTriplet(); 
        obj1.check(a, b, c);             
    }
}

