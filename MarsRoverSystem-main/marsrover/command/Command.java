package marsrover.command;

import marsrover.core.Rover;

public interface Command {
    void execute(Rover rover);
}
