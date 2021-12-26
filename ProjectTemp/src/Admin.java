
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Admin {
    LinkedList<Doctor> d;
    public Admin(){
        d=new LinkedList<>();
    }

    //data of doctors
    public void doctorsInitialData(){
        Doctor d1=new Doctor(1,"Dr.Strnge",33,'m',"Surgeon",100);
        d.add(d1);
        Doctor d2=new Doctor(2,"Dr.Whosee",77,'m',"Physician",300);
        d.add(d2);
        Doctor d3=new Doctor(3,"Dr.Joness",28,'f',"Orthopedist",100);
        d.add(d3);
        Doctor d4=new Doctor(4,"Dr.Drakez",50,'m',"Dermatologist",500);
        d.add(d4);
        Doctor d5=new Doctor(5,"Dr.Jessic",36,'f',"Neurologist",1000);
        d.add(d5);
    }

    Scanner sc=new Scanner(System.in);
    //view doctor details
    public void viewDoctorsDetails(){
        System.out.println("Enter choice for details of  \n1-All doctors \n2-Specific Doctor");
        switch (sc.nextInt()){
            case 1:{
                System.out.println("\nDoctor-ID \tDoctor-Name \tAge \t Sex \tSpeciality \n");
                for(int i=0;i<d.size();i++){
                    System.out.println(d.get(i).getDoctorID() + "\t\t"+d.get(i).getDoctorName()+"   \t"+d.get(i).getAge()+"\t  "+d.get(i).getDoctorSex()+"\t"+d.get(i).getDoctorSpeciality());
                }
                break;
            }
            case 2:{
                System.out.println("Enter the id of the doctor whose details are to be displayed ");
                int id=sc.nextInt();
                int i=searchDoctor(id);
                if(i>=0){
                   // System.out.println("\nDoctor-ID \tDoctor-Name \tAge \t Sex \tSpeciality ");
                    System.out.println("\nDoctor-ID" +"\t\t"+"Doctor-Name" +"\t\t"+"Age"+" \t\t"+" Sex"+" \t\t"+"Speciality ");
                    System.out.println(d.get(i).getDoctorID()+"\t\t"+d.get(i).getDoctorName()+"\t\t"+d.get(i).getAge()+"\t\t"+d.get(i).getDoctorSex()+"\t\t"+d.get(i).getDoctorSpeciality());
                }else{
                    System.out.println("Doctor ID invalid");
                }
                break;
            }
        }
    }


    //add doctor
    public void addDoctor(){
        do {
            System.out.println("Enter the Doctor details :- \n ");
            int i = d.size() + 1;
            System.out.println("Enter the Doctor Name  ");
            String name = sc.next();
            boolean flag=false;
            int age=24;
            while (!flag){
                try{
                    System.out.println("Enter the Doctor Age  ");
                    age = sc.nextInt();
                    if(age<23 || age>100){
                        throw new Exception();
                    }
                    flag=true;
                }catch (Exception e){
                    System.out.println("Invalid age for this Role");
                }
            }

            System.out.println("Enter the Doctor  Gender  ");
            char gender = sc.next().charAt(0);
            String DoctorType="";
            System.out.println("Enter the Doctor Speciality \n1-1:Surgeon\n2-Cardiologist\n3-Neurologist\n4-Physician\n5-Dermatologist ");
            switch (sc.nextInt()){
                case 1:
                    DoctorType="Surgeon";
                    break;
                case 2:
                    DoctorType="Cardiologist";
                    break;
                case 3:
                    DoctorType="Neurologist";
                    break;
                case 4:
                    DoctorType="Physician";
                    break;
                case 5:
                    DoctorType="Dermatologist";
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
            System.out.println("Enter the Check up fees");
            double fees=sc.nextDouble();
            Doctor doc = new Doctor(i, name, age, gender, DoctorType,fees);
            d.add(doc);
            System.out.println("Do you want to add more doctors if yes press 1 ");
        }while(sc.nextInt()==1);
    }

    //remove doctor
    public void removeDoctor(){
        System.out.println("Enter the id of the doctor to be Deleted ");
        int id=sc.nextInt();
        int i=searchDoctor(id);
        if(i>=0) {
            d.remove(i);
            System.out.println("Doctor Successfully Deleted");
        }
        else
        {
            System.out.println("Invalid Doctor Id ");
        }
    }

    //search doctors
    public int searchDoctor(int id){
        for(int i=0;i<d.size();i++){
            if(id==d.get(i).getDoctorID()){
                return i;
            }
        }
        return -1;
    }

    //seach doctor by speciality
    public int searchdoctor(String s){
        for(int i=0;i<d.size();i++){
            if(Objects.equals(s, d.get(i).getDoctorSpeciality())){
                return i;
            }
        }
        return -1;
    }
}
