package oops;

public class Table {
    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void move(){
        System.out.println("Moving table to another location");
    }

    public void createTable(){
        System.out.println("Create new Table");
    }

}


///private-- within the class
///protected-- accessible to child class
///public--- every
