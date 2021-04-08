package design_patterns.structural.bridge.person;

import design_patterns.structural.bridge.orientation.SexualOrientation;

public class Woman extends AbstractPerson {

    public Woman(String name, SexualOrientation orientation) {
        super(name, orientation);
    }
}
