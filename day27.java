class Product {

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int num1 = 6;  
        int num2 = 4;  

        Product obj = new Product();   
        int result = obj.multiply(num1, num2);  

        System.out.println("Product = " + result);
    }
}
