public class DiscountCalculation {
    public static void main(String[] args) {

        int price = 6000;   // Hardcoded input
        int discount = 0;

        if (price > 5000) {
            discount = price * 20 / 100;
        } 
        else if (price > 3000) {
            discount = price * 10 / 100;
        } 
        else {
            discount = 0;
        }

        int finalPrice = price - discount;

        System.out.println("Discount = ₹" + discount);
        System.out.println("Final Price = ₹" + finalPrice);
    }
}
 {
    
}
