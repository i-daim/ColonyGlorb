package upc.model.box;

import javax.swing.text.Position;

import upc.model.image.PixelColor;

public class Alien {
    private final Position target;
    private final PixelColor color;

    /** Cree un alien*/
    public Alien(Position target, PixelColor color) {
        this.target = target;
        this.color = color;
    }
}
