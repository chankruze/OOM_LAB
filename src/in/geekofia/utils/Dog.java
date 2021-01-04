package in.geekofia.utils;

import in.geekofia.utils.Animal;

public class Dog extends Animal {
    // constructor matching super
    public Dog(String name) {
        // create Animal instance
        super(name);
        // set the props value of Animal instance
        this.setType("Dog");
        this.setSound("Bark");
        this.setHasTail(true);
        this.setHandsCount(0);
        this.setLegsCount(4);
        this.setEarsCount(2);
        this.setEyesCount(2);
    }
}
