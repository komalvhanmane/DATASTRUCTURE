import java.util.List;
import java.util.Scanner;
public class Reception
{
    Scanner sc=new Scanner(System.in);
    int patientID=100;

    public void registerPatient(Admin a1)
    {
        do{
            System.out.println("Enter Patient name:");
            String pname=sc.next();
            boolean flag=false;
            int age=0;
            while (!flag){
                try{
                    System.out.println("Enter the Patient Age  ");
                    age = sc.nextInt();
                    if(age<0 || age>100){
                        throw new Exception();
                    }
                    flag=true;
                }catch (Exception e){
                    System.out.println("INVALID AGE");
                }
            }
            System.out.println("Enter Patient Gender:");
            char patientGender=sc.next().charAt(0);
            String DoctorType = "";
            System.out.println("Choose the doctor type:");
            System.out.println("1:Surgeon");
            System.out.println("2:Physician");
            System.out.println("3:Orthopedist");
            System.out.println("4:Dermatologist");
            System.out.println("5:Neurologist");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    DoctorType="Surgeon";
                    break;
                case 2:
                    DoctorType="Physician";
                    break;
                case 3:
                    DoctorType="Orthopedist";
                    break;
                case 4:
                    DoctorType="Dermatologist";
                    break;
                case 5:
                    DoctorType="Neurologist";
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    DoctorType=null;
                    break;
            }
            //System.out.println("Enter the amount patient needs to pay for appointment:");
            //float amountForAppointment =  //sc.nextFloat();
            Patient p1=new Patient(patientID++,pname,age,patientGender,DoctorType);

            int i=a1.searchdoctor(p1.getPatientIllness());
            if(i>=0){
                a1.d.get(i).p.add(p1);
                System.out.println("Registration Completed Successfully!! ");
            }
            else{
                System.out.println("Doctor Not available!!");
            }
            System.out.println("do you want to continue adding patients in the list press 1");
        }while (sc.nextInt()==1);
    }
    public void showappointmentDetails(Admin a1)
    {
        for(int i=0;i<a1.d.size();i++){
            System.out.println("Patient details of  : "+a1.d.get(i).getDoctorName());
            if(a1.d.get(i).p.isEmpty()){
                System.out.println("No Appointments Scheduled for today");
                System.out.println();
            }
            else{
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("patient-ID \t Patient-Name  \t\t Age \tSex ");
                List<Patient> P2=a1.d.get(i).p.stream().toList();
                for(int j=0;j<P2.size();j++){
                    System.out.println(P2.get(j).getPatientID()+"\t\t"+P2.get(j).getPatientName()+"\t\t"+P2.get(j).getAge()+"\t\t"+P2.get(j).getPatientSex()+"\t\t");
                }
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }

        }
    }
}

