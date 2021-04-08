package design_patterns.structural.bridge.person;

import design_patterns.structural.bridge.orientation.SexualOrientation;

public class Man extends AbstractPerson {

    public Man(String name, SexualOrientation orientation) {
        super(name, orientation);
    }
}
