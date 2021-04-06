package design_patterns.creational.builder;

public abstract class CatBuilder implements Builder<Cat> {

    protected String name;
    protected int age;
    protected boolean isFat;
    protected String color;
    protected String breed;
    protected boolean hasTesticles;

    @Override
    public Cat build() {
        return new Cat(name, age, isFat, color, breed, hasTesticles);
    }
}
