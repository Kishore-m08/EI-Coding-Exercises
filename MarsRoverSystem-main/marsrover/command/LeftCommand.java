package marsrover.command;

import marsrover.core.Rover;

public class LeftCommand implements Command {
    public void execute(Rover rover) { rover.turnLeft(); }
}
