package design_patterns.structural.decorator;

public abstract class Decorator implements ObsceneMessageProvider {

    private ObsceneMessageProvider wrapMessenger;

    public Decorator() {
    }

    public Decorator(ObsceneMessageProvider wrapMessenger) {
        this.wrapMessenger = wrapMessenger;
    }

    @Override
    public String get() {
        return wrapMessenger != null ? wrapMessenger.get() : "";
    }
}
