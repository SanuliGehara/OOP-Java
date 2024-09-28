package casestudy;

public class Student {
    private String studentId;
    private String studentName;
    private double minorComp1;
    private double minorComp2;
    private double projectDesign;
    private double projectImplementation;
    private double finalExamMark;

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

    public double getMinorAssignmentMarks() {
        return ((this.minorComp1 * 6.0/15 *100) + (this.minorComp2 * 9.0/15)) * 100/15;
    }

    public double getProjectMarks() {
        return ((this.projectDesign * 15.0/35 * 100 )+ (this.projectImplementation * 20.0/35) )* 100/35;
    }

    public double getFinalExamMark() {
        return this.finalExamMark * 50.0/100;
    }

    public double calculateOveralMark() {
        return getMinorAssignmentMarks() + getProjectMarks() + getFinalExamMark();
    }
    
    public String calculateGrade() {
        if (getFinalExamMark() > 50 && getMinorAssignmentMarks() > 35 && getProjectMarks()>35
                && calculateOveralMark() >50) {
            if (calculateOveralMark() >= 80) {
                return "Higher Distinction";
            }
            else if(calculateOveralMark() >= 70) {
                return  "Distinction";
            }
            else if (calculateOveralMark() >=60) {
                return  "Credit";
            }
            else if (calculateOveralMark() >= 50) {
                return  "Pass";
            }
            return  "Fail";

        } else {
            if (calculateOveralMark() > 50) return "Incomplete";
            return "Fail";
        }

    }
}
