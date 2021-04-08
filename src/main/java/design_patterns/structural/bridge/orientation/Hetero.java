package design_patterns.structural.bridge.orientation;

import design_patterns.structural.bridge.person.Person;

public class Hetero implements SexualOrientation {

    @Override
    public boolean isAttractive(Person subject, Person object) {
        return !subject.getClass().equals(object.getClass());
    }
}
