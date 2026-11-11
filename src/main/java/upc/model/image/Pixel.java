package upc.model.image;

public class Pixel {
    private Position position;
    private PixelColor color;

    public Pixel(Position position, PixelColor color) {
        this.position = position;
        this.color = color;
    }
}
