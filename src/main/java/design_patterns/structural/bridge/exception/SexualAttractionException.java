package design_patterns.structural.bridge.exception;

public class SexualAttractionException extends RuntimeException {

    public SexualAttractionException() {
    }

    public SexualAttractionException(String message) {
        super(message);
    }

    public SexualAttractionException(String message, Throwable cause) {
        super(message, cause);
    }

    public SexualAttractionException(Throwable cause) {
        super(cause);
    }
}
