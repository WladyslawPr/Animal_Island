package dev.wladpr.animals.carnivore;

import dev.wladpr.animals.abstracts.Animal;
import dev.wladpr.animals.plants.Herb;
import dev.wladpr.annotantions.parameterscarnivore;
import dev.wladpr.island.Island;
@parameterscarnivore
public class Boa extends Animal {

    public Boa() {
        this.x = 0;
        this.y = 0;
        this.energy = 3;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }
    public Boa(int x, int y, int energy) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.island = null;
        this.id = idList.size() + 1;
        idList.add(id);
    }

    @Override
    public void move(double direction) {
        int distance = (int) (Math.random() * 1);
        move(direction, distance);

    }
    @Override
    public void move(double direction, int distance) {
        super.move(direction, distance);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    @Override
    public char getSymbol() {    // @Emoji ?
        return 'b';
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void increaseEnergy() {
        this.energy++;

    }

    @Override
    public void decreaseEnergy() {
        this.energy--;

    }

    @Override
    public void increaseEnergy(int energy) {
        this.energy = this.energy + energy;

    }

    @Override
    public void decreaseEnergy(int energy) {
        this.energy = this.energy - energy;

    }

    public Island getIsland() {
        return island;
    }

    @Override
    public void setIsland(Island island) {
        this.island = island;

    }

    @Override
    public boolean isHungry() {
        return (energy < 3);
    }


    @Override
    public boolean feedSelf() {
        Herb herb = (island.hasHerb(x, y));
        if (herb != null) {
            herb.decreaseSize(1);
            increaseEnergy(3);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void seekFood() {
        super.seekFood();
    }

    @Override
    public String toString() {
        return "Boa{" +
                "symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                ", energy=" + energy +
                ", id=" + id +
                ", island=" + island +
                '}';
    }
}
