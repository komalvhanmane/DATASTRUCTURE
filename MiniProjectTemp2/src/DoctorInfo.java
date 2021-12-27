import java.util.List;

public class DoctorInfo {
    //check appointement
    public void checkAppointment(Doctor d){
        System.out.println("------------------------------------------------------------");

        if(d.p.isEmpty()){
            System.out.println("No Appointments Are Present");
        }
        else{
            System.out.println("ID\t\tName\t\tAge\t\tSex");
            List<Patient> P2=d.p.stream().toList();
            for(int j=0;j<P2.size();j++){
                System.out.println(P2.get(j).getPatientID()+"\t\t"+P2.get(j).getPatientName()+"\t\t"+P2.get(j).getAge()+"\t\t"+P2.get(j).getPatientSex()+"\t\t");
            }
        }
        System.out.println("------------------------------------------------------------");

    }

    //delete appointment
    public void deleteAppointment(Doctor d){
        if(d.p.isEmpty()){
            System.out.println("****No Appointments were Present****");
        }
        else{
            d.p.remove();
            System.out.println("Patient removed Successfully");
        }
    }

}
