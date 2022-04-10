package it.polimi.ingsw;

import it.polimi.ingsw.Constants.Colors;

import java.util.Map;

public interface hasEntrance {
    void addToEntrance(int playerIndex, Map<Colors, Integer> students);
    void removeFromEntrance(int playerIndex, Map<Colors, Integer> students);
}
