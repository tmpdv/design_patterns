package design_patterns.creational.prototype;

import java.util.Objects;

public class Yuri extends AbstractCloneableHuman {

    private int intelligence;
    private int psiEnergy;

    public Yuri(int speed, int intelligence, int psiEnergy) {
        super("Yuri", speed);
        this.intelligence = intelligence;
        this.psiEnergy = psiEnergy;
    }

    public Yuri(Yuri prototype) {
        super(prototype);
        this.intelligence = prototype.getIntelligence();
        this.psiEnergy = prototype.getPsiEnergy();
    }

    @Override
    public CloneableHuman cloneHuman() {
        return new Yuri(this);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPsiEnergy() {
        return psiEnergy;
    }

    public void setPsiEnergy(int psiEnergy) {
        this.psiEnergy = psiEnergy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Yuri yuri = (Yuri) o;
        return intelligence == yuri.intelligence &&
                psiEnergy == yuri.psiEnergy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intelligence, psiEnergy);
    }
}
