package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.test.JobField;

import java.util.Objects;
public class CoreCompetency extends JobField{

    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return this.getId() == that.getId();
    }
}
