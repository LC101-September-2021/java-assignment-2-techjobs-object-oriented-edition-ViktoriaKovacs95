package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
//    @Before
//    public void createJobObjects() {
//
//        Job emptyJob1 = new Job();
//        Job emptyJob2 = new Job();
//    }

    @Test

    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertNotEquals(testJob1, testJob2);

        assertEquals((testJob2.getId() - 1), testJob1.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertSame("Product tester", testJob.getName());

        assertSame("ACME", testJob.getEmployer().getValue());

        assertSame("Desert", testJob.getLocation().getValue());

        assertSame("Quality control", testJob.getPositionType().getValue());

        assertSame("Persistence", testJob.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // id values are not the same
        assertNotEquals(Job1, Job2);
    }


    @Test
    public void testToStringNewLines() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        int lastIndex = (testJob.toString().length() - 1);
//
//        assertEquals(testJob.toString().charAt(0) == '\n');
//        assertTrue(testJob.toString().charAt(lastIndex) == '\n');
    }

    @Test
    public void testToStringPrintLabels() {
        Job testJob5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals("\nID: " + testJob5.getId() + "\nName: Product tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Data not available\n" , testJob5.toString());


    }

    @Test
    public void testToStringDataUnavailable() {
        Job testJob = new Job();

        String[] lines = testJob.toString().trim().split("\n");

        System.out.println(testJob.toString());


        List<String> list = new ArrayList<String>(Arrays.asList(lines));
        list.remove(0);
        lines = list.toArray(new String[0]);

        String unavailable = "Data not available";

        for (String line : lines) {
            assertTrue(line.endsWith(unavailable));
        }
    }
}


