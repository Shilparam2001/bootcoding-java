package oops;

 abstract class Sim {
     abstract void inserted();
}
    class Idea extends Sim {
        void inserted() {
            System.out.println("Idea Sim Inserted");
        }
    }
    class Airtel extends Sim {
        void inserted() {
            System.out.println("Airtel sim inserted");
        }
    }
    class jio extends Sim {
        void inserted() {
            System.out.println("Jio sim inserted");

        }
    }
    class Magic {
        public void showMagic(Sim sim) {
            System.out.println("start");
            sim.inserted();
            System.out.println("End");
        }
    }





