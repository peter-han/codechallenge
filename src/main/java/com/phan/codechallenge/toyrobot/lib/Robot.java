package com.phan.codechallenge.toyrobot.lib;

import com.phan.codechallenge.toyrobot.exception.InvalidPlaceException;
import com.phan.codechallenge.toyrobot.exception.RobotCrashException;
import lombok.Data;

/**
 *
 */
@Data
public class Robot {

    Place place;
    Face face;

    public Robot(int x, int y, String face) throws RobotCrashException {
        try {
            this.place = new Place(x, y);
        } catch (InvalidPlaceException e) {
            throw new RobotCrashException(e.getMessage());
        }

        try {
            this.face = Face.valueOf(face);
        } catch (Exception e) {
            throw new RobotCrashException("Unrecognized direction, I'm lost!");
        }
    }

    public void move() {
        switch (face) {
            case east:
                place.updatePlace(1, 0);
                break;
            case west:
                place.updatePlace(-1, 0);
                break;
            case north:
                place.updatePlace(0, 1);
                break;
            case south:
                place.updatePlace(0, -1);
                break;
            default:
                //
        }

        System.out.println("I'm one step forward.");
        report();
    }

    public void left() {
        // anticlockwise
        int length = Face.values().length;
        face = Face.values()[(face.ordinal() - 1 + length) % length];

        System.out.println("I turned left.");
        report();
    }

    public void right() {
        // clockwise
        int length = Face.values().length;
        face = Face.values()[(face.ordinal() + 1 + length) % length];

        System.out.println("I turned right.");
        report();
    }

    public void report() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.join(", ", new String[]{place.x.toString(), place.y.toString(), face.toString()});
    }
}