package com.jamasoftware.services.restclient.jamadomain.fields;

import com.jamasoftware.services.restclient.jamadomain.values.TimeFieldValue;

public class TimeField extends JamaField {
    @Override
    public TimeFieldValue getValue() {
        TimeFieldValue timeFieldValue = new TimeFieldValue();
        populateFieldValue(timeFieldValue);
        return timeFieldValue;
    }

    @Override
    public String getType() {
        return "Time Field";
    }
}
