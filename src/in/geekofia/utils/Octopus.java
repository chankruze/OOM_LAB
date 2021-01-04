package in.geekofia.utils;

public class Octopus extends Animal{
    public Octopus(String name) {
        // create Animal instance
        super(name);
        // set the props value of Animal instance
        this.setType("Dog");
        this.setSound("No sound");
        this.setHandsCount(6);
        this.setLegsCount(2);
        this.setEyesCount(2);
    }
}
