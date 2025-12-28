class Discount {

    public static void main(String args[]) {

        double price = 6000;   // You can change this value
        double discount = 0;

        if (price > 5000) {
            discount = price * 0.20;   
        } 
        else if (price > 3000) {
            discount = price * 0.10;   
        } 
        else {
            discount = 0;              
        }

        double finalPrice = price - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Price = " + finalPrice);
    }
}
