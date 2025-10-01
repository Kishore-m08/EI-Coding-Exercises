package marsrover.core;

import marsrover.direction.Direction;



public class Rover {
    private Position position;
    private Direction direction;
    private final Grid grid;

    public Rover(Position start, Direction dir, Grid grid) {
        this.position = start;
        this.direction = dir;
        this.grid = grid;
    }

    public void move() {
        Position newPos = direction.move(position);
        if (grid.isValid(newPos) && !grid.isObstacle(newPos)) {
            this.position = newPos;
        } else {
            System.out.println("⚠ Obstacle or boundary detected. Move skipped.");
        }
    }

    public void turnLeft() { this.direction = direction.turnLeft(); }
    public void turnRight() { this.direction = direction.turnRight(); }

    public String report() {
        return "Rover is at " + position + " facing " + direction.getName();
    }
}
