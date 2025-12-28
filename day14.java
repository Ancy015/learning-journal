class Distance {

    public static void main(String args[]) {

        double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 7;

        double distance;

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance = " + distance);
    }
}
