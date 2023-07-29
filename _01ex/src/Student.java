public class Student {
    public String name;
    public double gradeA;
    public double gradeB;
    public double gradeC;

    public void finalGrade(){
        double finalGrade = gradeA + gradeB + gradeC;
        if(finalGrade > 60.00) {
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
            System.out.println("PASS");
        }
        else {
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", 60.00 - finalGrade) + " POINTS");
        }
    }
}


