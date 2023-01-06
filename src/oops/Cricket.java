package oops;

public class Cricket {
    int player;
    int Scores1;
    int Scores2;


    public void myTeam(){
        System.out.println("my Team played well");
    }

    public void oppositeTeam(){
        System.out.println("Opposite Team played really bad");
    }
    public void print(){
        System.out.println("No of players in a team:" + player);
        System.out.println("Scores of my team:" + Scores1);
        System.out.println("Scores of opposite team:" + Scores2);
    }
}
