package upc.model.box;

public class LaunchSpot {
    private AlienBox box;


    /** @return vrai si l'emplacement est libre */
    public boolean isEmpty() {
        return box == null;
    }

    /** @return une copie de la boîte, ou null si l'emplacement est vide */
    public AlienBox getBox() {
        return box == null ? null : box.copy();
    }

    /** Place une copie de la boîte dans l'emplacement.
     * @param newBox boîte à placer
     */
    public void placeBox(AlienBox newBox) {
        // TODO: exceptions
        if (isEmpty()) {
            box = newBox.copy();
        }
    }

    /** @return la boîte retirée, ou null si l'emplacement est vide */
    public AlienBox removeBox() {
        AlienBox removed = box;
        box = null;
        return removed;
    }

    /** @return une copie indépendante de l'emplacement */
    public LaunchSpot copy() {
        LaunchSpot copy = new LaunchSpot();
        if (box != null) {
            copy.placeBox(box);
        }
        return copy;
    }
}
