package dev.wladpr.animals.plants;

import dev.wladpr.interfacesgeographical.GeographicalFeature;
import dev.wladpr.island.Island;

import java.util.ArrayList;
import java.util.List;

public class Herb  implements GeographicalFeature {
    private int size;
    private char symbol = '#';
    private int x;
    private int y;
    private Island island;
    private int id;

    private static List<Integer> listId = new ArrayList<>();

    public Herb(int size, int x, int y) {

        this.size = size;
        this.x = x;
        this.y = y;
        this.island = null;
        this.id = listId.size() + 1;

        listId.add(id);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size++;
    }

    public void increaseSize() {
        this.size++;
    }

    protected void decreaseSize() {
        this.size--;
    }

    public void increaseSize(int increment) {
        this.size = this.size + increment;
    }

    public void decreaseSize(int increment) {
        this.size = this.size - increment;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    public char setSymbol(char symbol) {    // ?
        return symbol;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "size=" + size +
                ", symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                ", island=" + island +
                ", id=" + id +
                '}';
    }
}
