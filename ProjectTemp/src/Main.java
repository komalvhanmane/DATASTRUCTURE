import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Admin a=new Admin();
        a.doctorsInitialData();
        DoctorInfo di=new DoctorInfo();
        Reception r=new Reception();
        do{
            System.out.println("WHO ARE YOU ? \n1-ADMIN \n2-DOCTOR \n3-RECEPTIONIST");
            switch (sc.nextInt()){
                case 1:{
                    do{
                        System.out.println("---------------------ADMIN--------------------");
                        System.out.println("Enter the Password : ");
                        String pass=sc.next();
                        if(pass.equals("admin")){
                            System.out.println("you have successfully Loged in ");
                            do{
                                System.out.println("Enter your choice \n1-Add Doctor\n2-View Doctor\n3-Remove Doctor");
                                switch (sc.nextInt()){
                                    case 1:{
                                        a.addDoctor();
                                        System.out.println("Doctor Added Successfully");
                                        break;
                                    }
                                    case 2:{
                                        a.viewDoctorsDetails();
                                        break;
                                    }
                                    case 3:{
                                        a.removeDoctor();
                                        break;
                                    }
                                }
                                System.out.println("Do you want to continue as a admin if yes press 1");
                            }while (sc.nextInt()==1);
                        }
                        else{
                            System.out.println("Written Password is wrong");
                        }
                        System.out.println("Do you want to login again as a admin if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("---------------------DOCTOR--------------------");
                        System.out.println("Enter your Doctor ID :");
                        int id=sc.nextInt();
                        int index=a.searchDoctor(id);
                        if(index>=0){
                            System.out.println("Enter the Password : ");
                            String pass=sc.next();
                            if(pass.equals("doctor")){
                                System.out.println("you have successfully Loged in ");
                                do{
                                    System.out.println("Enter your choice \n1-Check Appointment\n2-Delete Appointement");
                                    switch (sc.nextInt()){
                                        case 1:{
                                            di.checkAppointment(a.d.get(index));
                                            break;
                                        }
                                        case 2:{
                                            di.deleteAppointment(a.d.get(index));
                                            break;
                                        }
                                    }
                                    System.out.println("Do you want to continue as a doctor if yes press 1");
                                }while (sc.nextInt()==1);
                            }
                            else{
                                System.out.println("Written Password is wrong");
                            }
                        }

                        System.out.println("Do you want to login again as a doctor if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 3:{
                    do{
                        System.out.println("----------------------RECEPTION--------------");
                        System.out.println("Enter the Password : ");
                        String pass=sc.next();
                        if(pass.equals("reception")){
                            System.out.println("you have successfully Loged in ");
                            do{
                                System.out.println("Enter your choice \n1-Register Patient\n2-Show Appointment Details");
                                switch (sc.nextInt()){
                                    case 1:{
                                        r.registerPatient(a);
                                        break;
                                    }
                                    case 2:{
                                        r.showappointmentDetails(a);
                                        break;
                                    }
                                }
                                System.out.println("Do you want to continue as a receptionist if yes press 1");
                            }while (sc.nextInt()==1);
                        }
                        else{
                            System.out.println("Written Password is wrong");
                        }
                        System.out.println("Do you want to login again as a receptionist if yes press 1");
                    }while (sc.nextInt()==1);
                }
            }
            System.out.println("Do you want to Login again in another role if yes press 1");
        }while (sc.nextInt()==1);
    }
}
