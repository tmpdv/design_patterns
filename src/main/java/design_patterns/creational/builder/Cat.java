package design_patterns.creational.builder;

import java.util.Objects;

public class Cat {
    private final String name;
    private final int age;
    private final Boolean isFat;
    private final String color;
    private final String breed;
    private final Boolean hasTesticles;

    public Cat(String name, int age, boolean isFat, String color, String breed, boolean hasTesticles) {
        this.name = name;
        this.age = age;
        this.isFat = isFat;
        this.color = color;
        this.breed = breed;
        this.hasTesticles = hasTesticles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(isFat, cat.isFat) &&
                Objects.equals(color, cat.color) &&
                Objects.equals(breed, cat.breed) &&
                Objects.equals(hasTesticles, cat.hasTesticles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isFat, color, breed, hasTesticles);
    }
}
