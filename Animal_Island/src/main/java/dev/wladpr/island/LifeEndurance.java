package dev.wladpr.island;

import dev.wladpr.animals.abstracts.Animal;
import dev.wladpr.animals.plants.Herb;

import java.util.ArrayList;
import java.util.List;

import static dev.wladpr.island.GenAnimals.animals;
import static dev.wladpr.island.GenHerbs.herbList;

public interface LifeEndurance {

    default void updateIsland() {

        // list of animals that die this turn
         List<Animal> deadAnimals = new ArrayList<>();

        // loop over all animals
        for (Animal a : animals) {

            if (a.isHungry()) {
                a.seekFood();

            } else {
                // if the animal is not hungry, move randomly.
                a.move(Math.random());
            }

            // reduce all animal's energy level by default amount
            a.decreaseEnergy();

            // if the animal's energy has reduced to 0, add to list of dead.
            if (a.getEnergy() == 0) {
                deadAnimals.add(a);
            }
        }

        // remove dead animals from island.
        for (Animal d : deadAnimals) {
            animals.remove(d);
        }

        // list of plants to remove if they've been eaten away.
        List<Herb> deadGrass = new ArrayList<>();

        for (Herb g : herbList) {
            if (g.getSize() == 0) {
                deadGrass.add(g);
            } else {
                g.increaseSize();
            }
        }

    }
}
