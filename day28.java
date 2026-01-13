class Circle {

    void calculate(double r) {
        double pi = 3.14;
        double circumference = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {

        double radius = 7;   // direct value like int a = 19

        Circle obj1 = new Circle();   
        obj1.calculate(radius);    
    }
}

