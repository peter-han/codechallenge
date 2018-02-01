package com.phan.codechallenge.toyrobot.lib;

import com.phan.codechallenge.toyrobot.exception.RobotCrashException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestRobotSunny {

    /**
     * PLACE 0,0,NORTH
     * MOVE
     * REPORT
     * Output: 0,1,NORTH
     */
    @Test
    public void testCase1() throws RobotCrashException {
        // 1. init
        Robot robot = new Robot(0, 0, "north");

        // 2. command
        robot.move();

        Assert.assertTrue(0 == robot.place.x);
        Assert.assertTrue(1 == robot.place.y);
        Assert.assertEquals(Face.north, robot.face);
    }

    /**
     * PLACE 0,0,NORTH
     * LEFT
     * REPORT
     * Output: 0,0,WEST
     */
    @Test
    public void testCase2() throws RobotCrashException {
        // 1. init
        Robot robot = new Robot(0, 0, "north");

        // 2. command
        robot.left();

        // Output: 0,0,WEST
        Assert.assertTrue(0 == robot.place.x);
        Assert.assertTrue(0 == robot.place.y);
        Assert.assertEquals(Face.west, robot.face);
    }

    /**
     * PLACE 1,2,EAST
     * MOVE
     * MOVE
     * LEFT
     * MOVE
     * REPORT
     * Output: 3,3,NORTH
     */
    @Test
    public void testCase3() throws RobotCrashException {
        // 1. init
        Robot robot = new Robot(1, 2, "east");

        // 2. command
        robot.move();
        robot.move();
        robot.left();
        robot.move();

        // Output: 3,3,NORTH
        Assert.assertTrue(3 == robot.place.x);
        Assert.assertTrue(3 == robot.place.y);
        Assert.assertEquals(Face.north, robot.face);
    }

}
