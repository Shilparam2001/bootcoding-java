package keywords.Methods;

public class Cycle {

    String Type;
    Double price;
    String Brand;
    int Quantity;

    public static Cycle createCycle() {
        Cycle cycle = new Cycle();
        cycle.Type = "Gear";
        cycle.price = 5000.0;
        cycle.Brand = "Hero";
        cycle.Quantity = 2;
        return  cycle;
    }

    public static Cycle createCycle(String t, Double p, String b, int q){
        Cycle cycle = new Cycle();
        cycle.Type = t;
        cycle.price = p;
        cycle.Brand = b;
        cycle.Quantity = q;
        return cycle;
    }

    public static void getCycle(Cycle cycle){
        System.out.println("Price of Cycle =" + cycle.price );
        System.out.println("Type of Cycle =" + cycle.Type );
        System.out.println("Brand of Cycle =" + cycle.Brand );
        System.out.println("Quantity of Cycle =" + cycle.Quantity );




    }




}
