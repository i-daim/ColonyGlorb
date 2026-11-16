package upc.model.image;

public class Board {
    private final Pixel[][] pixelBoard;
    private final int dimension;
    private int pixelCount;

    /**
     * @param board pixels indexés par colonne puis ligne
     * @param pixelCount nombre de pixels visibles
     */
    public Board(Pixel[][] board, int pixelCount) {
        pixelBoard = board;
        dimension = board.length;
        this.pixelCount = pixelCount;
    }

    /** @param x colonne
     * @param y ligne
     * @return une copie indépendante du pixel
     */
    public Pixel getPixelAt(int x, int y) {
        // TODO: exception (bounds)
        return pixelBoard[x][y].copy();
    }

    /** @return la largeur du plateau */
    public int getDimension() {
        return dimension;
    }

    /** @return le nombre de pixels visibles */
    public int getPixelCount() {
        return pixelCount;
    }

    /** @return une copie indépendante du plateau */
    public Board copy() {
        // TODO: exceptions (board non vide, pixels non nuls, ...)
        Pixel[][] newBoard = new Pixel[pixelBoard.length][pixelBoard[0].length];
        int newPixelCount = 0;

        for (int x = 0; x < pixelBoard.length; x++) {
            for (int y = 0; y < pixelBoard[x].length; y++) {
                newBoard[x][y] = pixelBoard[x][y].copy();
                if (pixelBoard[x][y].isVisible()) {
                    newPixelCount++;
                }
            }
        }
        return new Board(newBoard, newPixelCount);
    }
    /** @return la largeur */
    public int getWidth() {
        return dimension;
    }
    /** @return la hauteur */
    public int getHeight() {
        return pixelBoard[0].length;
    }
    /** @return le nombre de pixels restants */
    public int getRemainingPixelCount() {
        return pixelCount;
    }

    /** @param position position à vérifier
     * @return vrai si la position est dans le plateau
     */
    public boolean contains(Position position) {
        return position != null && position.x() >= 0 && position.x() < getWidth()
                && position.y() >= 0 && position.y() < getHeight();
    }
    /** @param position position du pixel à consommer
     * @return vrai si le pixel a été consommé
     */
    public boolean consumePixel(Position position) {
        // TODO: exception (position valide)
        if (!pixelBoard[position.x()][position.y()].consume()) {
            return false;
        }
        pixelCount--;
        return true;
    }
}
