public class Student {
    private int RegisterNo;
    private String Name;

    public Student(int registerNo, String name) {
        RegisterNo = registerNo;
        Name = name;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
