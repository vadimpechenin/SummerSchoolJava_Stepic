public class School {

    int schoolNumber ;
    double gradeMath ;
    double gradeRus ;
    double gradeInf ;
    double gradeAll;

    public School(int schoolNumber, double gradeMath, double gradeRus, double gradeInf, double gradeAll) {
        this.schoolNumber = schoolNumber;
        this.gradeMath = gradeMath;
        this.gradeRus = gradeRus;
        this.gradeInf = gradeInf;
        this.gradeAll = gradeAll;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public double getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(double gradeMath) {
        this.gradeMath = gradeMath;
    }

    public double getGradeRus() {
        return gradeRus;
    }

    public void setGradeRus(double gradeRus) {
        this.gradeRus = gradeRus;
    }

    public double getGradeInf() {
        return gradeInf;
    }

    public void setGradeInf(double gradeInf) {
        this.gradeInf = gradeInf;
    }

    public double getGradeAll() {
        return gradeAll;
    }

    public void setGradeAll(double gradeAll) {
        this.gradeAll = gradeAll;
    }
}

