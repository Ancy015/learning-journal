class Palindrome {
    public static void main(String[] args) {

        String str1 = "cool";
        String reversed = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed = reversed + str1.charAt(i);
        }

        if (str1.equals(reversed)) {
            System.out.println("Palindr=ome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
