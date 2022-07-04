package dev.wladpr.interfacesgeographical;

import dev.wladpr.island.Island;


public interface GeographicalFeature {

    int getX();
    int getY();
    char getSymbol();
    Island getIsland();
    void setIsland(Island island);
    String toString();
}
