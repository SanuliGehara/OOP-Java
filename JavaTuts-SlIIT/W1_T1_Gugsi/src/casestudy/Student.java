package casestudy;

public class Student {
    private String studentId;
    private String studentName;
    private double minorComp1;
    private double minorComp2;
    private double projectDesign;
    private double projectImplementation;
    private double finalExamMark;
    private double totalMinorAssignmentMark;
    private double totalProjectMark;
    private double totalOverallMark;
    private Grade grade;

    public Student(String studentId, String studentName, double minorComp1, double minorComp2,
                   double projectDesign, double projectImplementation, double finalExamMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.minorComp1 = minorComp1;
        this.minorComp2 = minorComp2;
        this.projectDesign = projectDesign;
        this.projectImplementation = projectImplementation;
        this.finalExamMark = finalExamMark;
    }

    public double calculateMinorAssignmentMarks() {
        totalMinorAssignmentMark = (this.minorComp1 * 6.0/15 *100) + (this.minorComp2 * 9.0/15) * 100/15;
        return totalMinorAssignmentMark;
    }

    public double calculateProjectMarks() {
        totalProjectMark = (this.projectDesign * 15.0/35 * 100 )+ (this.projectImplementation * 20.0/35) * 100/35;
        return totalProjectMark;
    }

    public double getFinalExamMark() { return this.finalExamMark;}

    // Calculate Total marks = Minor + Project + Final
    public void calculateOveralMark() {
        calculateMinorAssignmentMarks();
        calculateProjectMarks();
        totalOverallMark = totalMinorAssignmentMark + totalProjectMark + (finalExamMark * 0.5);
    }

    // Calculate the grade (HD, D, CR, C, F, I)
    public void calculateGrade() {
        if (finalExamMark > 50 && totalMinorAssignmentMark > 35 && totalProjectMark>35
                && totalOverallMark >50) {
            if (totalOverallMark >= 80) {
                grade = Grade.HIGHER_DISTINCTION;
            }
            else if(totalOverallMark >= 70) {
                grade = Grade.DISTINCTION;
            }
            else if (totalOverallMark >=60) {
                grade = Grade.CREDIT;
            }
            else if (totalOverallMark >= 50) {
                grade = Grade.PASS;
            }
            grade = Grade.FAIL;

        } else {
            if (totalOverallMark > 50) grade = Grade.INCOMPLETE;
            grade = Grade.FAIL;
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + studentName);
        System.out.println("Student No: " + studentId);
        System.out.println("Total Marks: " + totalOverallMark);
        System.out.println("Grade: " + grade);
    }
}
