package upc.model.image;

public class Pixel {
    private final Position position;
    private final PixelColor color;
    private boolean isVisible;

    /** @param position coordonnée du pixel
     * @param color couleur du pixel
     * @throws NullPointerException si un argument est nul
     */
    public Pixel(Position position, PixelColor color) {
        this.position = position;
        this.color = color;
        isVisible = true;
    }

    /** @return une copie indépendante de ce pixel */
    public Pixel copy() {
        Pixel copy = new Pixel(position, color);
        copy.isVisible = isVisible;
        return copy;
    }

    /** @return la position immuable */
    public Position getPosition() {
        return position;
    }

    /** @return la couleur du pixel */
    public PixelColor getColor() {
        return color;
    }

    /** @return vrai si le pixel n'est pas consommé */
    public boolean isVisible() {
        return isVisible;
    }

    /** Consomme le pixel.
     * @return vrai si son état a changé
     */
    boolean consume() {
        if (!isVisible) {
            return false;
        }
        isVisible = false;
        return true;
    }
}
