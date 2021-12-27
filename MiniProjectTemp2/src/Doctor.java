import java.util.LinkedList;
import java.util.Queue;

public class Doctor {
    private int DoctorID;
   private String DoctorName;
   private int age;
   private char DoctorSex;
   private String DoctorSpeciality;
   private String assignPatient;
   Queue<Patient> p;

    public int getPatientcount() {
        return patientcount;
    }

    public void setPatientcount(int patientcount) {
        this.patientcount = patientcount;
    }

    private int patientcount;

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    private double amt;//checking fees

    public Doctor(int doctorID, String doctorName, int age, char doctorSex, String doctorSpeciality,double fees) {
        DoctorID = doctorID;
        DoctorName = doctorName;
        this.age = age;
        DoctorSex = doctorSex;
        DoctorSpeciality = doctorSpeciality;
        //this.assignPatient = assignPatient;
        amt=fees;
        p=new LinkedList<>();
        patientcount=p.size();
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

    public String getAssignPatient() {
        return assignPatient;
    }

    public void setAssignPatient(String assignPatient) {
        this.assignPatient = assignPatient;
    }
}
