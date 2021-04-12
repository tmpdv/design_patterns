package design_patterns.structural.decorator;

import static design_patterns.structural.decorator.StringUtils.joinMessages;

public class CuntSender extends Decorator {

    public CuntSender() {
    }

    public CuntSender(ObsceneMessageProvider wrapMessenger) {
        super(wrapMessenger);
    }

    @Override
    public String get() {
        return joinMessages("Идите вопезду!", super.get());
    }
}
