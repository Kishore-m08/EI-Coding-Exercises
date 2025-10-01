package marsrover.direction;
import marsrover.core.Position;
class West implements Direction {
    public Direction turnLeft() { return new South(); }
    public Direction turnRight() { return new North(); }
    public Position move(Position pos) { return pos.move(-1, 0); }
    public String getName() { return "West"; }
}
