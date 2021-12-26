import java.util.LinkedList;
import java.util.Queue;

public class Doctor {
    private int DoctorID;
   private String DoctorName;
   private int age;
   private char DoctorSex;
   private String DoctorSpeciality;
    Queue<Patient> p;
   // double amt;

    public Doctor(int doctorID, String doctorName, int age, char doctorSex, String doctorSpeciality) {
        DoctorID = doctorID;
        DoctorName = doctorName;
        this.age = age;
        DoctorSex = doctorSex;
        DoctorSpeciality = doctorSpeciality;
        p=new LinkedList<>();
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int doctorID) {
        DoctorID = doctorID;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getDoctorSex() {
        return DoctorSex;
    }

    public void setDoctorSex(char doctorSex) {
        DoctorSex = doctorSex;
    }

    public String getDoctorSpeciality() {
        return DoctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        DoctorSpeciality = doctorSpeciality;
    }
}
