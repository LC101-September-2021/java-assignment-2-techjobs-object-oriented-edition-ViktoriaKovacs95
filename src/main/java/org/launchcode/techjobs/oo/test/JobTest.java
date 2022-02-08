package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

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

    public void  testSettingJobId () {
       Job emptyJob1 = new Job();
       Job emptyJob2 = new Job();

       // id values are not the same
       assertFalse(emptyJob1.equals(emptyJob2));

       // id values differ by one
       assertTrue((emptyJob2.getId() - 1) == emptyJob1.getId());
   }

   }


