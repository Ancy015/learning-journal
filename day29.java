class Grade {

    void calculateGrade(int marks) {

        System.out.println("Marks = " + marks);

        if (marks >= 90) {
            System.out.println("Grade = A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade = B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade = C");
        } 
        else if (marks >= 40) {
            System.out.println("Grade = D");
        } 
        else {
            System.out.println("Grade = Fail");
        }
    }

    public static void main(String[] args) {

        int mark = 75;

        Grade obj = new Grade();      
        obj.calculateGrade(mark);    
    }
}

