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

    public void calculateMinorAssignmentMarks() {
        totalMinorAssignmentMark = (this.minorComp1 * 0.06) + (this.minorComp2 * 0.09) ;
    }

    public void calculateProjectMarks() {
        totalProjectMark = (this.projectDesign * 0.15 )+ (this.projectImplementation * 0.20);
    }

    public double getMinorCompMark() { return this.totalMinorAssignmentMark;}
    public double  getProjectMark() { return this.totalProjectMark;}
    public double getFinalExamMark() { return this.finalExamMark;}

    // Calculate Total marks = Minor + Project + Final
    public void calculateOveralMark() {
        calculateMinorAssignmentMarks();
        calculateProjectMarks();
        totalOverallMark = totalMinorAssignmentMark  + totalProjectMark  + (finalExamMark * 0.5);
    }

    // Calculate the grade (HD, D, CR, C, F, I)
    public void calculateGrade() {
        if (finalExamMark >= 50 && totalMinorAssignmentMark >= 15* 0.35 && totalProjectMark> 35 * 0.35
                && totalOverallMark >= 50) {
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

        } else {
            if (totalOverallMark >= 50 && finalExamMark<50) {
                grade = Grade.INCOMPLETE;
            } else {
                grade = Grade.FAIL;
            }
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + studentName);
        System.out.println("Student No: " + studentId);
        System.out.println("Total Marks: " + totalOverallMark);
        System.out.println("Grade: " + grade);
    }
}
