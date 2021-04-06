package design_patterns.creational.abstract_factory.factory.impl;

import design_patterns.creational.abstract_factory.domain.Animal;
import design_patterns.creational.abstract_factory.domain.Human;
import design_patterns.creational.abstract_factory.domain.Plant;
import design_patterns.creational.abstract_factory.domain.kaif.Cat;
import design_patterns.creational.abstract_factory.domain.kaif.Ganja;
import design_patterns.creational.abstract_factory.domain.kaif.Hippie;
import design_patterns.creational.abstract_factory.factory.LifeFactory;

public class KaifLifeFactory implements LifeFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Human createHuman() {
        return new Hippie();
    }

    @Override
    public Plant createPlant() {
        return new Ganja();
    }
}
