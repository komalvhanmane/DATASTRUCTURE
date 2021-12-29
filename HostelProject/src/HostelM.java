import java.util.*;
class Node{
    int rno;
    float rentD=10000;
    float rentM=8000;
    String name;
    String branch;
    String prof;
    String date;
    int mno;
    String email;
    Node next;
    Node(){

    }

    Node(String name,String branch,String prof,String date,int mno,int rno,String email,float rentD
            ,float rentM){
        this.rno=rno;
        this.branch=branch;
        this.prof=prof;
        this.date=date;
        this.mno=mno;
        this.email=email;
        this.name=name;
        rentD=10000;
        rentM=8000;
        next=null;

    }

}
class LinkedList{
    Node head=null;


    int i,pos=0,flag=0;
    int can;
    Scanner sc=new Scanner(System.in);
    LinkedList(){
        head=null;
    }


    public void create(String name,String branch,String prof,String date,int mno,int rno,String email,float rentD
            ,float rentM){
        Node node=new Node();
        node.name=name;
        node.branch=branch;
        node.prof=prof;
        node.date=date;
        node.mno=mno;
        node.rno=rno;
        node.email=email;
        node.rentD=rentD;
        node.rentM=rentM;

        if(head==null) {
            head=node;
        }
        else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
            n.next=node;

        }
        show();
    }
    void show() {
        Node n=head;
        while(n!=null) {
            System.out.println("---------------------------------------");
            System.out.println("Basic Information");
            System.out.println("Name: "+n.name);
            System.out.println("Branch: "+n.branch);
            System.out.println("Profession:  "+n.prof);
            System.out.println("Hostellite since: "+n.date);
            System.out.println("Room no.: "+n.rno);
            if(n.rentD==0) {
                System.out.println("Opted for 3 Sharing");
                System.out.println("Rent: "+n.rentM);
            }
            else {
                System.out.println("Opted for Double sharing");
                System.out.println("Rent: "+n.rentD);
            }
            System.out.println("<--Contact Information--> ");
            System.out.println("email: "+n.email);
            System.out.println("Mobile number: "+n.mno);
            System.out.println("---------------------------------------");
            n=n.next;
        }
    }
    void Add(int bopt) {
        Node ptr=head;
        Node temp =new Node();
        if(bopt==1) {

            System.out.println("Thank you! you've opted for an admission in Baya Karve Hostel of Shivaji nagar\n We're very sorry to inform you that the admissions are temporarily closed due to unavailability of beds!\n I hope "
                    + "you will take us into consideration.");
            System.out.println("New UPDATES:\n We again apologize for the inconvinience of yours as the reservations are also in excess so we can't accept your"
                    + " reservation! Kindly Pardon us!");
        }
        else if(bopt==2) {
            System.out.println("------------Thank you! you've opted for an admission in Baya Karve Hostel of Kothrud--------------");
            System.out.println("The below information is compulsory to be filled by hostel faculty...");
            System.out.println();
            System.out.println("Enter the Name of the Candidate: ");
            temp.name=sc.next();
            sc.next();
            temp.branch="Kothrud";
            System.out.println("Enter the Profession: ");
            temp.prof=sc.next();
            sc.next();
            System.out.println(" Date of admission(Pls enter in the format- dd-mm-yyyy): ");
            temp.date=sc.next();
            System.out.println("Enter the type of room:\n1- double sharing\t 2- triple sharing: ");
            int choice=sc.nextInt();
//System.out.println("Enter the Rent");
            if(choice==1) {
                temp.rentD=10000;
            }
            else {
                temp.rentM=8000;
            }
            System.out.println("Enter the room no to be alloted: ");
            temp.rno=sc.nextInt();
            System.out.println();
            System.out.println("---------------Contact Details of the Candidate--------------");
            System.out.println("Pls Entre the mobile number: ");
            temp.mno=sc.nextInt();
            System.out.println("Pls Enter the Email ID: ");
            temp.email=sc.next();
        }
        else if(bopt==3) {
            System.out.println("-----------Thank you! you've opted for an admission in Baya Karve Hostel of Karvenagar--------");
            System.out.println("The below information is compulsory to be filled by hostel faculty...");
            System.out.println();
            System.out.println("Enter the Name of the Candidate: ");
            temp.name=sc.next();
            temp.branch="Karvenagar";
            sc.next();
            System.out.println("Enter the Profession: ");
            temp.prof=sc.next();
            sc.next();
            System.out.println(" Date of admission(Pls enter in the format- dd-mm-yyyy): ");
            temp.date=sc.next();
            System.out.println("Enter the type of room:\n1- double sharing\t 2- triple sharing: ");
            int choice=sc.nextInt();
//System.out.println("Enter the Rent");
            if(choice==1) {
                temp.rentD=10000;
            }
            else {
                temp.rentM=8000;
            }
            System.out.println("Enter the room no to be alloted: ");
            temp.rno=sc.nextInt();
            System.out.println();
            System.out.println("---------------Contact Details of the Candidate--------------");
            System.out.println("Pls Entre the mobile number: ");
            temp.mno=sc.nextInt();
            System.out.println("Pls Enter the Email ID: ");
            temp.email=sc.next();
        }
        else {
            System.out.println("Thank you! you've opted for an admission in Baya Karve Hostel of Singhgad\n But we're very sorry to inform you that due to maitainence The Baya Karve Hostel of Singhgad has been "
                    + "compelled to shut down to make sure about the safety of students!");

        }
        if(temp.rno==1) {
            temp.next=head;
            head=temp;
        }
        else
        if(temp.rno>1 && temp.rno<length()) {
            i=1;
            while(i<(temp.rno-1)) {
                ptr=ptr.next;
                i++;
            }
            temp.next=ptr.next;
            ptr.next=temp;
        }
        else {
            System.out.println("Error!! There are more rooms vacant before the room you've entered");
        }
    }

    void delete(int bopt) {
        System.out.println("Enter the name of candidate to be delted");
        String name=sc.next();
//sc.next();

        if(head==null) {
            System.out.println("Empty list");

        }
        else {
//Node n=head.next;
            Node temp1=head;
/*while(n.next!=null) {
if(n.name==name) {
Node n1=head;
while(n1.next!=null) {
if(n1.next==n) {
n1.next=n.next;
}
else {
n1=n1.next;
}
}
n=n.next;
}
if(n.name==name) {
Node n1=head;
while(n1.next!=null) {
if(n1.next==n) {
n1.next=null;
}
else {
n1=n1.next;
}
}
n=null;
}

}

}*/
            Node prev=head;
            while(temp1!=null && !temp1.name.equals(name)){
                prev=temp1;
                temp1=temp1.next;
            }
            if(temp1==null){
                System.out.println("Data Not Found ");
                return;
            }
            prev.next=temp1.next;
            System.out.println("Your desired account successfully deleted");
        }
    }


    void search(){
        Node temp=head;
        String searchname;
        System.out.println("Enter the name of the candidate you want to search for:");
        searchname=sc.next();

        while(temp!=null){
            if(temp.name==searchname){
                System.out.println("Candidate found");
            }
            else{
                System.out.println("Not found!");
                break;
            }
        }

    }


    int length() {
        int c=0;
        Node ptr=head;
        while(ptr!=null) {
            c++;
            ptr=ptr.next;
        }
        return c;
    }

}
 class Main {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        int opt;
        LinkedList l=new LinkedList();
        LinkedList l2=new LinkedList();
        l.create("Sukanya Wagh","Karvenagar","Student at Cummins","23-12-2020",832654292,1,"sukanya.wagh@cumminscollege.in",8000,0);
        l.create("Avni Patil","Karvenagar","Student at Cummins","01-01-2021",792514622,2,"avni.patil@cumminscollege.in",0,10000);
        l.create("Vaishnavi Muluk","Karvenagar","Student at MIT","23-02-2021",832654262,1,"vaishnavi.muluk@gmail.com",8000,0);
        l.create("Shraddha Desai","Karvenagar","Teaching Faculty at Cummins","03-09-2021",8324292,1,"shraddha.desai@cumminscollege.in",8000,0);
        l2.create("Vishakha Advani","Kothrud","Student","25-11-2021",632654292,9,"vishakha.advani@gmail.com",0,10000);
        l2.create("Sukanya Shellar","Kothrud","Working Woman at Xyz Company","27-12-2020",652654292,1,"sukanya.shellar@gmail.com",8000,0);
        l2.create("Sukanya","Kothrud","Student at Cummins","23-12-2020",832654292,1,"sukanya.wagh@cumminscollege.in",8000,0);
        l2.create("Sharanya Kolapkar","Kothrud","UPSC Student","25-10-2021",632654225,3,"sharnya.kolapkar@gmail.com",0,10000);
        l2.create("Roshni Shukla","Kothrud","Student at DY Patil","29-12-2021",832656692,5,"roshni.shukla2gmail.com",0,10000);
        Scanner sc=new Scanner(System.in);
        System.out.println("-*-*-*-*-*-Welcome to Baya Karve Hostels-*-*-*-*-*-*");
        System.out.println();
        System.out.println("1.Shivaji-Nagar\t\t2.Kothrud\n3.Karvenagar\t\t4.Singhgad");
        System.out.println("Enter the number assigned to the branch you want ot search for: ");
        System.out.println();
        int bopt=sc.nextInt();
        do {
            System.out.println("Enter your choice for the operation you want to perform: ");
            System.out.println();
            System.out.println("1.Hostel Scheme\n2.Admission\n3.Details of all canditates\n4. Display particular candidates\n5. Deletion");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:

                    System.out.println("Hostel Details-->");
                    System.out.println("Total number of rooms: 75 in each building");
                    System.out.println("Number of buildings: 4");
                    System.out.println("Total number of student (approx.): Around 700");
                    System.out.println("Rent: \n For Double sharing:\t10000");
                    System.out.println("Triple Sharing: \t 8000");
                    System.out.println("Note the above prices are including FOOD & Electricity BILL");
                    System.out.println("Facilities: \n1. Fresh Atmosphere\n2. 24x7 Security/n3. Geysers\n4. Regular Maintainance\n5. Gym\n6. Seperate Study Rooms &"
                            + " Recreation rooms\n6. Kitchen for cooking\n7. Medical Facility\n8. Well maintained garden for Walks and Chillings");
                    System.out.println("Most Important - ANTI-RAGGING MEASURES are taken ");
                    System.out.println("Admission procedure\r\n"
                            + "For procuring admission, the students should have the following documents\r\n"
                            + "\r\n"
                            + "Proof of admission in the concerned institute.\r\n"
                            + "Two photographs, one stamp size and the other passport size.\r\n"
                            + "Medical fitness certificate by Registered Medical Practitioner.\r\n"
                            + "Local guardian shall accompany the ward for signature at the time of admission.\r\n"
                            + "Address proof.");


                    break;
                case 2:
                    if(bopt==3) {
                        l.Add(bopt);
                        l.show();
                    }
                    else if(bopt==2){
                        l2.Add(bopt);
                        l2.show();
                    }
                    else if(bopt==1){
                        l.Add(bopt);
                    }
                    else{
                        l.Add(bopt);
                    }

                    break;
                case 3:
                    if(bopt==3) {
                        l.show();
                    }
                    else if(bopt==2){
                        l2.show();
                    }
                    else if(bopt==4) {
                        System.out.println("Thank you! for showing interest in Baya Karve Hostel of Singhgad\n But we're very sorry to inform you that due to maitainence The Baya Karve Hostel of Singhgad has been "
                                + "compelled to shut down to make sure about the safety of students!");
                    }
                    else {
                        System.out.println("Thank you!for showing interest in Baya Karve Hostel of Shivaji Nagar\n But we're very sorry to inform you that There is some technical issue faced by The Baya Karve Hostel of Shivaji Nagar and hence led to  "
                                + "the server crash!\n We beg for pardon! Pls revisit after a while!");
                    }
                    break;
                case 4:
                    if(bopt==3) {
                        l.search();
                    }
                    else if(bopt==2){
                        l2.search();
                    }
                    else if(bopt==4) {
                        System.out.println("Thank you! for showing interest in Baya Karve Hostel of Singhgad\n But we're very sorry to inform you that due to maitainence The Baya Karve Hostel of Singhgad has been "
                                + "compelled to shut down to make sure about the safety of students!");
                    }
                    else {
                        System.out.println("Thank you!for showing interest in Baya Karve Hostel of Shivaji Nagar\n But we're very sorry to inform you that There is some technical issue faced by The Baya Karve Hostel of Shivaji Nagar and hence led to  "
                                + "the server crash!\n We beg for pardon! Pls revisit after a while!");
                    }

                    break;
                case 5:
                    if(bopt==3) {
                        l.delete(bopt);
                    }
                    else if(bopt==2){
                        l2.delete(bopt);
                    }
                    else if(bopt==4) {
                        System.out.println("Thank you! for showing interest in Baya Karve Hostel of Singhgad\n But we're very sorry to inform you that due to maitainence The Baya Karve Hostel of Singhgad has been "
                                + "compelled to shut down to make sure about the safety of students!");
                    }
                    else {
                        System.out.println("Thank you!for showing interest in Baya Karve Hostel of Shivaji Nagar\n But we're very sorry to inform you that There is some technical issue faced by The Baya Karve Hostel of Shivaji Nagar and hence led to  "
                                + "the server crash!\n We beg for pardon! Pls revisit after a while!");
                    }
                    break;
// case 6:
                default:
                    System.out.println("Oops! Invalid choice please entre correct option!");
                    break;

            }

            System.out.println("Do you want to continue?");
            System.out.println("Enter 1 if YES or any key if NO");
            opt=sc.nextInt();
        }while(opt==1);

    }

}

