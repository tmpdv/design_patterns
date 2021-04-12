package design_patterns.structural.decorator;

import static design_patterns.structural.decorator.StringUtils.joinMessages;

public class NahSender extends Decorator {

    public NahSender() {
    }

    public NahSender(ObsceneMessageProvider wrapMessenger) {
        super(wrapMessenger);
    }

    @Override
    public String get() {
        return joinMessages("Идите нах!", super.get());
    }
}
