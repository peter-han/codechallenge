package com.phan.codechallenge.toyrobot.lib;

import com.phan.codechallenge.toyrobot.exception.RobotCrashException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Command {

    private Command() {
    }

    public static Robot placeRobot() throws RobotCrashException {

        Scanner scan = new Scanner(System.in);
        try {
            /*
            1. input
             */
            System.out.println("Enter a place to start (x), the place must be a valid int: ");
            int placeX = scan.nextInt();

            System.out.println("Enter a place to start (y), the place must be a valid int: ");
            int placeY = scan.nextInt();

            System.out.println("Enter a robot facing to (east, south, west, north): ");
            String facing = scan.next();

            return new Robot(placeX, placeY, facing);

        } catch (InputMismatchException e) {
            throw new RobotCrashException("Unrecognized place, I'm lost!");
        }
    }

    public static void robotGo(Robot robot) {
        Scanner scan = new Scanner(System.in);

        String command = null;
        while (!"report".equalsIgnoreCase(command)) {
            System.out.println("Robot is waiting command (move, left, right, report): ");
            command = scan.next();

            switch (command) {
                case "move":
                    robot.move();
                    break;
                case "left":
                    robot.left();
                    break;
                case "right":
                    robot.right();
                    break;
                case "report":
                    robot.report();
                    break;

                default:
                    System.out.println("I don't understand your command.");
            }
        }
    }
}
