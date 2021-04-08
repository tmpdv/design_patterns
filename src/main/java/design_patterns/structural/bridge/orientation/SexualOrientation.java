package design_patterns.structural.bridge.orientation;

import design_patterns.structural.bridge.person.Person;

public interface SexualOrientation {
    boolean isAttractive(Person subject, Person object);
}
