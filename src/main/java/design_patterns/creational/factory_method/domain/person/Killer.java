package design_patterns.creational.factory_method.domain.person;

public class Killer {

    public void kill(Killable killable) {
        killable.setDead();
    }
}
