public class Patient {

    private int patientID;
    private String patientName;
    private int age;
    private char patientSex;
    private	String patientIllness;
    private float amountForAppointment;

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(char patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientIllness() {
        return patientIllness;
    }

    public void setPatientIllness(String patientIllness) {
        this.patientIllness = patientIllness;
    }

    public float getAmountForAppointment() {
        return amountForAppointment;
    }

    public void setAmountForAppointment(float amountForAppointment) {
        this.amountForAppointment = amountForAppointment;
    }

    public Patient(int patientID, String patientName, int age, char patientSex, String patientIllness, float amountForAppointment)
    {
        this.patientID=patientID;
        this.patientName=patientName;
        this.age=age;
        this.patientSex=patientSex;
        this.patientIllness=patientIllness;
        this.amountForAppointment=amountForAppointment;
    }
}
