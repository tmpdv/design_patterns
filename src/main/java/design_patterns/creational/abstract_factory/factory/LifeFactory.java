package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.domain.Animal;
import design_patterns.creational.abstract_factory.domain.Human;
import design_patterns.creational.abstract_factory.domain.Plant;

public interface LifeFactory {

    Animal createAnimal();

    Human createHuman();

    Plant createPlant();
}
