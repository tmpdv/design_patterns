package design_patterns.creational.builder;

public class CatManualBuilder extends CatBuilder {

    public CatManualBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CatManualBuilder age(int age) {
        this.age = age;
        return this;
    }

    public CatManualBuilder isFat(boolean isFat) {
        this.isFat = isFat;
        return this;
    }

    public CatManualBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CatManualBuilder breed(String breed) {
        this.breed = breed;
        return this;
    }

    public CatManualBuilder hasTesticles(boolean hasTesticles) {
        this.hasTesticles = hasTesticles;
        return this;
    }
}
