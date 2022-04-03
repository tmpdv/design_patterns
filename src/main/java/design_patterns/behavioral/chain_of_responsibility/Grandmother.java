package design_patterns.behavioral.chain_of_responsibility;

public class Grandmother extends BaseEducationHandler {

    @Override
    public void handle(You you) {
        if (!you.washedTheDishes()) {
            you.beScolded();
            System.out.println("Ты получил пизды от бабки");
        }
        super.handle(you);
    }
}
