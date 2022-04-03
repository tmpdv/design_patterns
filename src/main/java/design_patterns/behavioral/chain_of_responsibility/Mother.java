package design_patterns.behavioral.chain_of_responsibility;

public class Mother extends BaseEducationHandler {

    @Override
    public void handle(You you) {
        if (!you.didTheLessons()) {
            you.beScolded();
            System.out.println("Ты получил пизды от мамки");
        }
        super.handle(you);
    }
}
