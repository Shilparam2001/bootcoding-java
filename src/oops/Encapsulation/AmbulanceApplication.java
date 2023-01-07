package oops.Encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance amb = new Ambulance();
        amb.getCharges();
        amb.getHospitalName();
        amb.isAvailable();
        amb.getType();

        amb.setAvailable(false);
        amb.setCharges(1500);
        amb.setHospitalName("Anand Hospital");
        amb.setType("van");

        System.out.println("Ambulance Info");
        System.out.println("Hospital Name:" + amb.getHospitalName());
        System.out.println("Ambulance is available:" + amb.isAvailable());
        System.out.println("Type of the Ambulance:" + amb.getType());
    }
}
