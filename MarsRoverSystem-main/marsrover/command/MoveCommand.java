package marsrover.command;

import marsrover.core.Rover;

public class MoveCommand implements Command {
    public void execute(Rover rover) { rover.move(); }
}
