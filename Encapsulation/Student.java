package Encapsulation;

public class Student {
    int studentID;
    String studentName;
    String collegeName;
    String studentAddress;

    //getters
     public int getStudentID() {
        return this.studentID;
    }
     public String getStudentName() {
        return this.studentName;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
     public String getStudentAddress() {
        return this.studentAddress;
    }

    //setters
    public void setStudentID(int a) {
        this.studentID = a;
    }
    public void setStudentName(String a) {
        this.studentName = a;
    }
    public void setCollegeName(String a) {
        this.collegeName = a;
    }
    public void setStudentAddress(String a) {
        this.studentAddress = a;
    }
}
