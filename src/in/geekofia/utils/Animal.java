package in.geekofia.utils;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name, scientificName, type, sound;
    private int eyesCount, earsCount, legsCount, handsCount;
    private boolean hasTail;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(String name, String scientificName, String type, String sound, int eyesCount, int earsCount, int legsCount, int handsCount, boolean hasTail) {
        this.name = name;
        this.scientificName = scientificName;
        this.type = type;
        this.sound = sound;
        this.eyesCount = eyesCount;
        this.earsCount = earsCount;
        this.legsCount = legsCount;
        this.handsCount = handsCount;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public int getHandsCount() {
        return handsCount;
    }

    public void setHandsCount(int handsCount) {
        this.handsCount = handsCount;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(int eyesCount) {
        this.eyesCount = eyesCount;
    }

    public int getEarsCount() {
        return earsCount;
    }

    public void setEarsCount(int earsCount) {
        this.earsCount = earsCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                ", eyesCount=" + eyesCount +
                ", earsCount=" + earsCount +
                ", legsCount=" + legsCount +
                ", handsCount=" + handsCount +
                ", hasTail=" + hasTail +
                '}';
    }
}
