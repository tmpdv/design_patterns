package design_patterns.behavioral.chain_of_responsibility;

public interface EducationHandler {
    void setNext(EducationHandler handler);
    void handle(You you);
}
