package oops;

public class Chess {
    int players;
    String color;
    
    public void startGame(){
        System.out.println("Game Started: ");
    }
    public void endGame(){
        System.out.println("Game Ends:");
    }
    public void print(){
        System.out.println("No of players:" + players);
        System.out.println("Color: " + color);
    }


    public void display(String s) {

        System.out.println("No one wins");
    }
}
