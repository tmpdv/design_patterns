package design_patterns.behavioral.chain_of_responsibility;

public abstract class BaseEducationHandler implements EducationHandler {

    private EducationHandler next;

    @Override
    public void setNext(EducationHandler handler) {
        this.next = handler;
    }

    @Override
    public void handle(You you) {
        if (next != null) {
            next.handle(you);
        }
    }
}
