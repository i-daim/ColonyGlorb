package upc.model.box;

import upc.model.image.PixelColor;

public class AlienBox {
    private final PixelColor color;
    private final int size;
    private int remainingAliens;

    /** @param color couleur de la boîte
     * @param size nombre initial d'aliens, strictement positif
     */
    public AlienBox(PixelColor color, int size) {
        // TODO: exceptions (null, size)
        this.color = color;
        this.size = size;
        this.remainingAliens = size;
    }

    /** @return la couleur de la boîte */
    public PixelColor getColor() {
        return color;
    }
    /** @return le nombre initial d'aliens */
    public int getSize() {
        return size;
    }
    /** @return le nombre d'aliens restants */
    public int getRemainingAliens() {
        return remainingAliens;
    }

    /** @return une copie indépendante de la boîte */
    public AlienBox copy() {
        AlienBox copy = new AlienBox(color, size);
        copy.remainingAliens = remainingAliens;
        return copy;
    }
    /** @return vrai si la boîte est vide */
    public boolean isEmpty() {
        return remainingAliens == 0;
    }
    /** Utilise un alien.
     * @return vrai si un alien était disponible
     */
    public boolean useAlien() {
        if (isEmpty()) {
            return false;
        }
        remainingAliens--;
        return true;
    }
}
