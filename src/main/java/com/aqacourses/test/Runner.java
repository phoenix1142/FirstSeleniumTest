package com.aqacourses.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(OpenPage.class);

        if (result.wasSuccessful()) {
            System.out.println("Success!");
        } else {
            for (Failure failure : result.getFailures()) {
                System.err.println("Exception - " + failure.getException());
                System.err.println("Trace - " + failure.getTrace());
            }

        }
    }
}
