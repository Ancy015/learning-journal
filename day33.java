public class day33 {

    
    public static void checkPalindrome(int number) {
        int original = number;
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        
        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }
    }

    public static void main(String[] args) {
        int number = 121; 
        checkPalindrome(number);
    }
}

