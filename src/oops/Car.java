package oops;

public class Car {
    public String color;
    public String model;
    public String brandName;
    public int lights;
    public int seats;
    public String fuelType;


    public void startEngine(){
        System.out.println("Engine Started");

}
    public void stopEngine(){
        System.out.println("Engine Stopped");

    }
    public void move(){
        System.out.println("car moved");

    }
    public void print(){

        System.out.println("color " + color);
        System.out.println("model" + model);
        System.out.println("brandName" + brandName );
        System.out.println("fuelType" + fuelType);
        System.out.println("lights" + lights);
        System.out.println("Seats" + seats);
    }
}
