class Vote {
 
    void eligible(int a) {
        if (a >= 18) {
            System.out.println("Eligible to 2026 Vote"); 
        } else {
            System.out.println("Not Eligible for 2026  vote"); 
        }
    }

    public static void main(String[] args) {

        int a = 19;   

        Vote obj1 = new Vote();   
        obj1.eligible(a);          
    }
}
