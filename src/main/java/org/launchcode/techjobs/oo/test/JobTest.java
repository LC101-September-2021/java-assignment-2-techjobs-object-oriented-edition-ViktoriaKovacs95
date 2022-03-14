package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


import static org.junit.Assert.assertEquals;



import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

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

        assertTrue(testJob.getName() instanceof String);

        assertTrue(testJob.getEmployer() instanceof Employer);

        assertTrue(testJob.getLocation() instanceof Location);

        assertTrue(testJob.getPositionType() instanceof PositionType);

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product Tester" , testJob.getName());
        assertEquals("ACME" , testJob.getEmployer().getValue());
        assertEquals("Desert" , testJob.getLocation().getValue());
        assertEquals("Quality control" , testJob.getPositionType().getValue());
        assertEquals("Persistence" , testJob.getCoreCompetency().getValue());

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
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        ;
        int lastIndex = (testJob4.toString().length() - 1);
//
       assertEquals( '\n',testJob4.toString().charAt(0));
       assertEquals( '\n', testJob4.toString().charAt(lastIndex));
    }

    @Test
    public void testToStringPrintLabels() {
        Job testJob5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
         assertEquals("\nID: " + testJob5.getId() + "\nName: Product tester\nEmployer: \nLocation: Desert\nPosition Type: Quality control\nCore Competency" , testJob5.toString());

    }
    @Test
    public void testToString_DataNotAvailable() {
        Job testJob6 = new Job("  ", new Employer(" "), new Location(" "), new PositionType(" "), new CoreCompetency(" "));
            assertEquals("Data Not Available", testJob6.toString());
        }
    }








