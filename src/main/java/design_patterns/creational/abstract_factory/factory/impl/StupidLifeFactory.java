package design_patterns.creational.abstract_factory.factory.impl;

import design_patterns.creational.abstract_factory.domain.Animal;
import design_patterns.creational.abstract_factory.domain.Human;
import design_patterns.creational.abstract_factory.domain.Plant;
import design_patterns.creational.abstract_factory.domain.stupid.Idiot;
import design_patterns.creational.abstract_factory.domain.stupid.Oak;
import design_patterns.creational.abstract_factory.domain.stupid.Sheep;
import design_patterns.creational.abstract_factory.factory.LifeFactory;

public class StupidLifeFactory implements LifeFactory {

    @Override
    public Animal createAnimal() {
        return new Sheep();
    }

    @Override
    public Human createHuman() {
        return new Idiot();
    }

    @Override
    public Plant createPlant() {
        return new Oak();
    }
}
