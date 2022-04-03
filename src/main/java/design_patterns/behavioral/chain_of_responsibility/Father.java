package design_patterns.behavioral.chain_of_responsibility;

public class Father extends BaseEducationHandler {

    @Override
    public void handle(You you) {
        if (you.smokedBehindTheGarages()) {
            you.beScolded();
            System.out.println("Ты получил пизды от папки");
        }
        super.handle(you);
    }
}
