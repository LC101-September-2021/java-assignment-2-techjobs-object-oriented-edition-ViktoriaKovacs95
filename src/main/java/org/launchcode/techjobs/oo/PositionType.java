package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.test.JobField;

import java.util.Objects;

public class PositionType extends JobField {


    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }


}
