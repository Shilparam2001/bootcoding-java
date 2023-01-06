package keywords.Methods;

public class DusterApplication {
    public static void main(String[] args) {

        Duster duster=new Duster();
        Duster Duster1 = Duster.createDuster();
        Duster duster2=Duster.createDuster(34.5,"Camlin", "Blue" ,"black");



        Duster.printDuster(Duster1);
        Duster.printDuster(duster2);


    }
}
