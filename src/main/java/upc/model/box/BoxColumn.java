package upc.model.box;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BoxColumn {
    private final Deque<AlienBox> boxes = new ArrayDeque<>();
    /** @param boxes boîtes ordonnées du haut vers le bas */
    public BoxColumn(List<AlienBox> boxes) {
        for (AlienBox box : boxes) {
            this.boxes.addLast(box.copy());
        }
    }
    /** @return une copie indépendante de la colonne */
    public BoxColumn copy() {
        return new BoxColumn(List.copyOf(boxes));
    }
    /** @return vrai si la colonne est vide */
    public boolean isEmpty() {
        return boxes.isEmpty();
    }
    /** @return une copie de la boîte du haut, ou null si vide */
    public AlienBox getFirst() {
        return isEmpty() ? null : boxes.peekFirst().copy();
    }
    /** @return la boîte retirée du haut, ou null si vide */
    public AlienBox removeFirst() {
        return boxes.pollFirst();
    }
}
