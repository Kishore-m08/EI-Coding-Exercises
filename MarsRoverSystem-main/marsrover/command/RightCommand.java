package marsrover.command;

import marsrover.core.Rover;

public class RightCommand implements Command {
    public void execute(Rover rover) { rover.turnRight(); }
}
