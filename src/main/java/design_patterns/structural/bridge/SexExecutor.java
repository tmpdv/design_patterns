package design_patterns.structural.bridge;

import design_patterns.structural.bridge.exception.SexualAttractionException;
import design_patterns.structural.bridge.person.Person;

public class SexExecutor {

    public void fuck(Person person1, Person person2) {
        if (!person1.getOrientation().isAttractive(person1, person2)) {
            throw new SexualAttractionException(person2 + " is not attractive to " + person1);
        }
        if (!person2.getOrientation().isAttractive(person2, person1)) {
            throw new SexualAttractionException(person1 + " is not attractive to " + person2);
        }
        System.out.println("Oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah-oh-ah!!!");
    }
}
