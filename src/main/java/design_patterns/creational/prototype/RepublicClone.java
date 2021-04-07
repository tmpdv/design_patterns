package design_patterns.creational.prototype;

import java.util.Objects;

import static design_patterns.creational.prototype.RandomUtil.randomCloneName;

public class RepublicClone extends AbstractCloneableHuman {

    private int power;
    private int dexterity;
    private int accuracy;

    public RepublicClone(String name, int speed, int power, int dexterity, int accuracy) {
        super(name, speed);
        this.power = power;
        this.dexterity = dexterity;
        this.accuracy = accuracy;
    }

    public RepublicClone(RepublicClone prototype) {
        super(prototype);
        this.setName(randomCloneName());
        this.power = prototype.getPower();
        this.dexterity = prototype.getDexterity();
        this.accuracy = prototype.getAccuracy();
    }

    @Override
    public CloneableHuman cloneHuman() {
        return new RepublicClone(this);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RepublicClone that = (RepublicClone) o;
        return power == that.power &&
                dexterity == that.dexterity &&
                accuracy == that.accuracy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, dexterity, accuracy);
    }
}
