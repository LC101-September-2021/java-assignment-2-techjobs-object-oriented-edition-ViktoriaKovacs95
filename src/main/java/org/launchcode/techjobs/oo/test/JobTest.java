package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Before
    public void createJobObjects() {
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();
    }

    @Test

    public void testSettingJobId() {
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();

        // id values are not the same
        assertFalse(emptyJob1.equals(emptyJob2));

        // id values differ by one
        assertTrue((emptyJob2.getId() - 1) == emptyJob1.getId());
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
    public void testJobsForEquality(){
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();
assertFalse(emptyJob1 == emptyJob2);


    }

}


