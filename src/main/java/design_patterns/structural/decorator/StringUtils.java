package design_patterns.structural.decorator;

public final class StringUtils {

    public static String joinMessages(String first, String second) {
        if (first != null) {
            if (second == null || second.isBlank()) {
                return first;
            }
            return String.join("\n", first, second);
        } else {
            return "";
        }
    }
}
