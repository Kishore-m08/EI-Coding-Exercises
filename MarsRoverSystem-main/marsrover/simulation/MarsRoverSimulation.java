package marsrover.simulation;

import marsrover.core.*;
import marsrover.direction.*;
import marsrover.command.*;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        Rover rover = new Rover(new Position(0,0), new North(), grid);

        Command[] commands = {
            new MoveCommand(),
            new MoveCommand(),
            new RightCommand(),
            new MoveCommand(),
            new LeftCommand(),
            new MoveCommand()
        };

        for (Command cmd : commands) {
            cmd.execute(rover);
            System.out.println(rover.report());
        }

        
    }
}
