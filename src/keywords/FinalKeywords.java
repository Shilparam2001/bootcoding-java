package keywords;

import oops.Marker;

public class FinalKeywords {

    public static void main(String[] args) {
        final int a = 10;
        //a = 20; //re- assign another value
        //a = 30; //changing value of a again
        final double PI = 3.14;
        //PI = 2.14 //not allowed
        //final keyword to Object (reference variable)
        final Marker blueMarker = new Marker();
        //blueMarker = new Marker();//not allowed
        //It is allowed to change property of an object
        blueMarker.color = "Red";
        blueMarker.color = "blue";

    }

}
