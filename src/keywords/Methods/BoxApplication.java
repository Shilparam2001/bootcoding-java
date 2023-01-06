package keywords.Methods;

import static keywords.Methods.Cycle.*;

public class BoxApplication {
    public static void main(String[] args) {
//        Box b = new Box();
//        Box b1 = Box.createBox();
//        Box b2 = Box.createBox(7.5, 2.5, 5.5);
//        Box.printBox(b1);
//        Box.printBox(b2);
//
         Cycle c = new Cycle();
          Cycle c1 = Cycle.createCycle();
          Cycle c2 = Cycle.createCycle("Gear",5000.0,"Hero",2);
          Cycle.getCycle(c2);

        ElectricCycle ec = new ElectricCycle();
        ElectricCycle.createCycle();
        Cycle cycle = createCycle("Electric", 5000.0, "Hero", 2);
        ElectricCycle.getCycle(cycle);


    }
}

//Duster -----> rectangular,
//Helmet ----->
//Cycle
