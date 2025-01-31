import Encapsulation.Student;
import Polymorphism.AXIS;
import Polymorphism.Bank;
import Polymorphism.ICIC;
import Polymorphism.SBI;
import Abstraction.Bank2;
import Abstraction.SBI2;
import Abstraction.PNB2;

public class Main {
    public static void main(String[] args){
        polyMorph();
        Encap();
        Abst();

    }
    public static void polyMorph(){
        //Parent
        Bank b1 = new Bank();
        System.out.println(b1.getRateOfInterest());

        //Children overriding Parent
        SBI s1 = new SBI();
        System.out.println(s1.getRateOfInterest());
        ICIC c1 = new ICIC();
        System.out.println(c1.getRateOfInterest());
        AXIS a1 = new AXIS();
        System.out.println(a1.getRateOfInterest());
    }
    public static void Encap(){
        Student s1 = new Student();

        s1.setStudentID(0001);
        s1.setStudentName("Janie");
        s1.setCollegeName("UNG");
        s1.setStudentAddress("123 Pilots Drive");

        System.out.println("New student "+ s1.getStudentID() + " " + s1.getStudentName() + " at " + s1.getStudentAddress() + " goes to " + s1.getCollegeName());
    }
    public static void Abst(){
        Bank2 s1 = new SBI2();
        Bank2 p1 = new PNB2();
        s1.getRateOfInterest();
        p1.getRateOfInterest();

    }

}
