package oops.Encapsulation;

public class Ambulance {
    private String hospitalName;
    private String type;
    private double charges;
    private boolean isAvailable;

    //Use Get Methods and Set methods
    //to assign value - Use Setter
    //to get value - Use Getter

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
