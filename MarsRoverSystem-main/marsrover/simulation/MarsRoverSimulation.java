package marsrover.simulation;

import marsrover.core.*;
import marsrover.direction.*;
import marsrover.command.*;

import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);
        grid.addObstacle(5, 5);
        grid.addObstacle(6, 2);
        grid.addObstacle(7, 7);
        grid.addObstacle(1, 8);
        grid.addObstacle(8, 3)
        Rover rover = new Rover(new Position(0, 0), new North(), grid);

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mars Rover Simulation ===");
        System.out.println("Rover starts at (0,0) facing North.");
        int i=0;

        while (i!=30) {
            System.out.println("\nMenu:");
            System.out.println("1 - Move Forward");
            System.out.println("2 - Turn Left");
            System.out.println("3 - Turn Right");
            System.out.println("4 - Report Rover Status");
            System.out.println("0 - Exit");
            System.out.print("Enter choice: ");

            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Enter a number from the menu.");
                continue;
            }

            switch (choice) {
                case 1:
                    new MoveCommand().execute(rover);
                    System.out.println("Moved.");
                    System.out.println(rover.report());
                    break;
                case 2:
                    new LeftCommand().execute(rover);
                    System.out.println("Turned left.");
                    System.out.println(rover.report());
                    break;
                case 3:
                    new RightCommand().execute(rover);
                    System.out.println("Turned right.");
                    System.out.println(rover.report());
                    break;
                case 4:
                    System.out.println("Rover status:");
                    System.out.println(rover.report());
                    break;
                case 0:
                    System.out.println("Exiting simulation. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Unknown choice. Please enter a valid menu number.");
            }
            i++;
        }
    }
}

