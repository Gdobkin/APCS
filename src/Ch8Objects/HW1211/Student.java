package Ch8Objects.HW1211;

public class Student {
    private String name;
    private int grade;
    private String school;
    private int studId;
    private double gpa;
    private int dob;
    private String[] schedule;
    private String address;
    private String counselor;
    private int attendance;
    private char gender;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public int getStudId() {
        return studId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDob() {
        return dob;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public int getAttendance() {
        return attendance;
    }

    public char getGender() {
        return gender;
    }



    public Student(String name, int grade, double gpa, int dob, String address, String counselor, int attendance, char gender) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.dob = dob;
        this.address = address;
        this.counselor = counselor;
        this.attendance = attendance;
        this.gender = gender;
    }

    public String toString(){
        return("Name: "+ name + " Grade: " + grade + " GPA: "+ gpa);
    }
}
