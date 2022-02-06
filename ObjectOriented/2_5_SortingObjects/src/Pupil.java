public class Pupil {
    String name;
    String surname;
    int schoolNumber ;
    int gradeMath ;
    int gradeRus ;
    int gradeInf ;

    public Pupil(String name, String surname, int schoolNumber, int gradeMath, int gradeRus, int gradeInf) {
        this.name = name;
        this.surname = surname;
        this.schoolNumber = schoolNumber;
        this.gradeMath = gradeMath;
        this.gradeRus = gradeRus;
        this.gradeInf = gradeInf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public int getGradeRus() {
        return gradeRus;
    }

    public void setGradeRus(int gradeRus) {
        this.gradeRus = gradeRus;
    }

    public int getGradeInf() {
        return gradeInf;
    }

    public void setGradeInf(int gradeInf) {
        this.gradeInf = gradeInf;
    }
}
