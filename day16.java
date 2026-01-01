class Cgpa {

    public static void main(String args[]) {

        int DS = 60;
        int Oops = 68;
        int Dbs = 50;
        int Fds = 50;
        int Dpco = 70;
        int Maths = 80;

        int sumOfGradePoints = DS + Oops + Dbs + Fds + Dpco + Maths;
        int numberOfSubjects = 6;

        double gradePoints = (double) sumOfGradePoints / numberOfSubjects;

        System.out.println("CGPA=" + gradePoints);
    }
}

