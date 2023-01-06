package keywords.Methods;

public class Duster {

   double price;
   String brand;
   String color;
    String color1;




            public static Duster createDuster() {
             Duster duster = new Duster();
             duster.price = 150.8;
             duster.brand = "camlin";
             duster.color = "Red";
             duster.color1 = "Blue";
             return duster;
         }




       public static Duster createDuster(double p, String  b, String c, String co) {
        Duster duster = new Duster();
        duster.price=p;
        duster.brand=b;
        duster.color=c;
        duster.color1=co;
        return duster;



    }
    public static void printDuster(Duster duster){

        System.out.println(duster.price);
        System.out.println(duster.brand);
        System.out.println(duster.color);
        System.out.println(duster.color1);


    }



}
