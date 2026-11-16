package upc.model.box;

import java.util.ArrayList;
import java.util.List;

public class LaunchLine {
    private final List<LaunchSpot> spots = new ArrayList<>();
    /** Crée une ligne de cinq emplacements vides. */
    public LaunchLine() {
        for (int i = 0; i < 5; i++) {
            spots.add(new LaunchSpot());
        }
    }
    /** @return vrai si tous les emplacements sont occupés */
    public boolean isFull() {
        for (LaunchSpot spot : spots) {
            if (spot.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    /** @return indice du premier emplacement libre, ou -1 si la ligne est pleine */
    public int findFreeSpot() {
        for (int i = 0; i < spots.size(); i++) {
            if (spots.get(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }
    /** Ajoute une copie de la boîte au premier emplacement libre.
     * @param box boîte à ajouter
     * @return vrai si la boîte a été ajoutée
     */
    public boolean addBox(AlienBox box) {
        // TODO: exception null
        int index = findFreeSpot();
        if (index < 0) {
            return false;
        }
        spots.get(index).placeBox(box);
        return true;
    }

    /** @return une liste non modifiable de copies des emplacements */
    public List<LaunchSpot> getSpots() {
        ArrayList<LaunchSpot> newList = new ArrayList<>();
        for (LaunchSpot spot : spots) {
            newList.add(spot.copy());
        }
        return newList;
    }

    /** Retire la boîte d'un emplacement.
     * @param index indice de l'emplacement
     * @return la boîte retirée, ou null si l'emplacement est vide
     */
    public AlienBox removeBox(int index) {
        return spots.get(index).removeBox();
    }

    /** @return une copie indépendante de la ligne */
    public LaunchLine copy() {
        LaunchLine copy = new LaunchLine();
        for (int i = 0; i < spots.size(); i++) {
            if (!spots.get(i).isEmpty()) {
                copy.spots.get(i).placeBox(spots.get(i).getBox());
            }
        }
        return copy;
    }
}
