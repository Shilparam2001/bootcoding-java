package oops;

public class Demo {
    public static void main(String[] args) {
        Magic m = new Magic();
        Idea idea = new Idea();
        Airtel airtel = new Airtel();
        jio j = new jio();
        m.showMagic(idea);
        m.showMagic(airtel);
        m.showMagic(j);
    }
}
