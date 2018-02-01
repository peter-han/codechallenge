package com.phan.codechallenge.toyrobot.lib;

import com.phan.codechallenge.toyrobot.exception.RobotCrashException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestRobotRainy {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test()
    public void testRobotCrashInvalidPlace() throws Exception {
        // expect
        thrown.expect(RobotCrashException.class);
        thrown.expectMessage("I'm out of Table!");

        new Robot(-2, 9, "east");
    }

    @Test()
    public void testRobotCrashUnrecognizedFace() throws Exception {
        // expect
        thrown.expect(RobotCrashException.class);
        thrown.expectMessage("Unrecognized direction, I'm lost!");

        new Robot(0, 4, "bla bla");
    }

}
