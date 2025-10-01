package marsrover.direction;
import marsrover.core.Position;
class East implements Direction {
    public Direction turnLeft() { return new North(); }
    public Direction turnRight() { return new South(); }
    public Position move(Position pos) { return pos.move(1, 0); }
    public String getName() { return "East"; }
}
