package design_patterns.creational.abstract_factory.factory.impl;

import design_patterns.creational.abstract_factory.domain.Animal;
import design_patterns.creational.abstract_factory.domain.Human;
import design_patterns.creational.abstract_factory.domain.Plant;
import design_patterns.creational.abstract_factory.domain.insolent.Asshole;
import design_patterns.creational.abstract_factory.domain.insolent.Goat;
import design_patterns.creational.abstract_factory.domain.insolent.Nettle;
import design_patterns.creational.abstract_factory.factory.LifeFactory;

public class InsolentLifeFactory implements LifeFactory {

    @Override
    public Animal createAnimal() {
        return new Goat();
    }

    @Override
    public Human createHuman() {
        return new Asshole();
    }

    @Override
    public Plant createPlant() {
        return new Nettle();
    }
}
