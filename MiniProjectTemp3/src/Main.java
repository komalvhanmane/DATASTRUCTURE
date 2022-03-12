import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Admin a=new Admin("Miss Komal",35);
        a.doctorsInitialData();
        DoctorInfo di=new DoctorInfo();
        Reception r=new Reception();
        r.patientInitialData(a);
        System.out.println("-------------------------------------------------------------");
        System.out.println("_________________WELCOME TO CITY HOSPITAL____________________");
        System.out.println("-------------------------------------------------------------");
        do{
            System.out.println("WHO ARE YOU ? \n1-ADMIN \n2-RECEPTIONIST \n3-DOCTOR");
            switch (sc.nextInt()){
                case 1:{
                    do{
                        System.out.println("-----------------------------ADMIN----------------------------");
                        System.out.println("Enter the Password : ");
                        String pass=sc.next();
                        if(pass.equals("admin")){                                                                           //checking if the password is correct
                            System.out.println("You have logged in successfully ");                                         //password entered is correct
                            do{
                                System.out.println("Enter your choice \n1-Add Doctor\n2-View Doctor\n3-Remove Doctor");
                                switch (sc.nextInt()){
                                    case 1:{
                                        a.addDoctor();                                                                      //calling add doctor method from class admin
                                        break;
                                    }
                                    case 2:{
                                        a.viewDoctorsDetails();                                                            //calling view doctor details() method from class admin
                                        break;
                                    }
                                    case 3:{
                                        a.removeDoctor();                                                                  //calling remove doctor method of class admin
                                        break;
                                    }
                                }
                                System.out.println("Do you want to continue as a admin, if yes press 1");
                            }while (sc.nextInt()==1);
                        }
                        else{
                            System.out.println("The Password Entered is Incorrect! Please try again");                     //password entered is incorrect,so admin can't access the methods
                        }
                        System.out.println("Do you want to login again as a admin, if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("------------------------------RECEPTION----------------------");
                        System.out.println("Enter the Password : ");
                        String pass=sc.next();
                        if(pass.equals("reception")){                                                                       //checking if the password is correct
                            System.out.println("You have logged in successfully");                                          //password entered is correct
                            do{
                                System.out.println("Enter your choice \n1-Register Patient\n2-Show Appointment Details\n3-Cancel Appointments");
                                switch (sc.nextInt()){
                                    case 1:{
                                        r.registerPatient(a);                                                               //calling register patient() method of class reception
                                        break;
                                    }
                                    case 2:{
                                        r.showappointmentDetails(a);                                                        //calling show appointment() method of class reception
                                        break;
                                    }
                                    case 3:{

                                    }
                                }
                                System.out.println("Do you want to continue as a receptionist, if yes press 1");
                            }while (sc.nextInt()==1);
                        }
                        else{
                            System.out.println("The password entered is incorrect! Please try again");                      //password entered is incorrect,so receptionist can't access the methods
                        }
                        System.out.println("Do you want to login again as a receptionist, if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 3:{
                    do{
                        System.out.println("-----------------------------DOCTOR----------------------------");
                        System.out.println("Enter your Doctor ID :");                                                       //doctor specific login
                        int id=sc.nextInt();
                        int index=a.searchDoctor(id);
                        if(index>=0){
                            System.out.println("Enter the Password : ");
                            String pass=sc.next();
                            if(pass.equals("doctor")){                                                                      //checking if the password is correct
                                System.out.println("You have logged in successfully ");                                     //password entered is correct
                                do{
                                    System.out.println("Enter your choice \n1-Check Appointment\n2-Delete Appointement");
                                    switch (sc.nextInt()){
                                        case 1:{
                                            di.checkAppointment(a.d.get(index));                                            //calling checkAppointment() method of doctorInfo class
                                            break;
                                        }
                                        case 2:{
                                            di.deleteAppointment(a.d.get(index));                                           //calling deleteAppointment() method of doctorInfo class
                                            break;
                                        }
                                    }
                                    System.out.println("Do you want to continue as a doctor, if yes press 1");
                                }while (sc.nextInt()==1);
                            }
                            else{
                                System.out.println("The Password Entered is Incorrect! Please try again");                  //password entered is incorrect,so doctor can't access the methods
                            }
                        }
                        else{
                            System.out.println("Doctor ID invalid");                                                       //if doctorID is not correct
                        }

                        System.out.println("Do you want to login again as a doctor, if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
            }   
            System.out.println("Do you want to Login again in another role, if yes press 1");
        }while (sc.nextInt()==1);

        System.out.println("-----------------------------------THANK YOU----------------------------------");
    }
}
