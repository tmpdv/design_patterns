package design_patterns.structural.decorator;

import static design_patterns.structural.decorator.StringUtils.joinMessages;

public class AssSender extends Decorator {

    public AssSender() {
    }

    public AssSender(ObsceneMessageProvider wrapMessenger) {
        super(wrapMessenger);
    }

    @Override
    public String get() {
        return joinMessages("Идите в жопу!", super.get());
    }
}
