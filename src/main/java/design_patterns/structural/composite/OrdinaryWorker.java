package design_patterns.structural.composite;

public class OrdinaryWorker extends AbstractWorker {

    public OrdinaryWorker(String name) {
        super(name);
    }

    @Override
    public void cussOut() {
        System.out.println(getName() + ": \"I am not a head. No way to relieve stress :(\"");
        setHappy(false);
    }
}
