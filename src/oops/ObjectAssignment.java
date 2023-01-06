package oops;

public class ObjectAssignment {
    public static void main(String[] args) {
        //primitive data types
        int a = 10;
        float b = a;// b <- (value of a)
        b = 30;// b - change but not changing a
        System.out.println("A ki value = " + a);
        System.out.println("B ki value =" + b);

        //ADT - Abstract Data Type(Object)
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker; // redMarker <- BlueMarker (reference)
        blueMarker.color = "Blue";
        redMarker.color = "Red";
        System.out.println("BlueMarker ki value= "+ blueMarker.color);
        System.out.println("RedMarket ki value= "+ redMarker.color);
    }
}
//objects are stored in heap memory
//local variables are stored in stack