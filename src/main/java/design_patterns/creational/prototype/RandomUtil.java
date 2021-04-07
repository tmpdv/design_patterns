package design_patterns.creational.prototype;

public final class RandomUtil {

    public static int randomIntInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String randomCloneName() {
        return "CT-" + randomIntInRange(1000, 9999);
    }
}
