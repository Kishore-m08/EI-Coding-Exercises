
package marsrover.core;
public class Grid {
    private final int width;
    private final int height;
    private final Cell[][] cells;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        cells = new Cell[width][height];
        for (int i=0; i<width; i++)
            for (int j=0; j<height; j++)
                cells[i][j] = new EmptyCell();
    }

    public void addObstacle(int x, int y) {
        cells[x][y] = new ObstacleCell();
    }

    public boolean isValid(Position pos) {
        int x = pos.getX(), y = pos.getY();
        return x >= 0 && y >= 0 && x < width && y < height;
    }

    public boolean isObstacle(Position pos) {
        return cells[pos.getX()][pos.getY()].isObstacle();
    }
}
