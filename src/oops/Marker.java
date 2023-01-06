package oops;

public class Marker {
    // Data member
    String type;
    String brand;
   public String color;
    double price;

    // Member Methods


    public void refill(){
        System.out.println("Refill marker Successfully");

    }
    public void write(String message){
        System.out.println("On White Board- " + message);
    }
    public void print(){
        System.out.println("Marker Brand: " + brand);
        System.out.println("Marker Type: " + type);
        System.out.println("Marker Color: " + color);
        System.out.println("Marker Price: " + price);

    }
}
        //single line
        /*
        multiline
         */
        /**
         Documentation comment
        */
