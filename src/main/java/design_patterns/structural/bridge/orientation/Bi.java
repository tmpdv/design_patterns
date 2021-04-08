package design_patterns.structural.bridge.orientation;

import design_patterns.structural.bridge.person.Person;

public class Bi implements SexualOrientation {

    @Override
    public boolean isAttractive(Person subject, Person object) {
        return true;
    }
}
