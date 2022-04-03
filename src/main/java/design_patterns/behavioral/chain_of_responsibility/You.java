package design_patterns.behavioral.chain_of_responsibility;

public class You {
    private boolean didTheLessons;
    private boolean smokedBehindTheGarages;
    private boolean washedTheDishes;
    private boolean isScolded;
    private int timesScolded = 0;


    public boolean didTheLessons() {
        return didTheLessons;
    }

    public void setDidTheLessons(boolean didTheLessons) {
        this.didTheLessons = didTheLessons;
    }

    public boolean smokedBehindTheGarages() {
        return smokedBehindTheGarages;
    }

    public void setSmokedBehindTheGarages(boolean smokedBehindTheGarages) {
        this.smokedBehindTheGarages = smokedBehindTheGarages;
    }

    public boolean washedTheDishes() {
        return washedTheDishes;
    }

    public void setWashedTheDishes(boolean washedTheDishes) {
        this.washedTheDishes = washedTheDishes;
    }

    public boolean isScolded() {
        return isScolded;
    }

    public void beScolded() {
        timesScolded++;
        isScolded = true;
    }

    public int getTimesScolded() {
        return timesScolded;
    }
}
