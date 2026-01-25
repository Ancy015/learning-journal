class Palindrome {

    void check(int number) {

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;          
            sum = (digit*digit* digit) + sum ;         
            number = number / 10;             
        }

        if (original == sum) {               
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String args[]) {

        int number = 121;                   
        Palindrome obj1 = new Palindrome();   
        obj1.check(number);                 
    }
}

