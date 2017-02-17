package com.jamasoftware.services.restclient.jamadomain.fields;

import com.jamasoftware.services.restclient.jamadomain.lazyresources.PickList;
import com.jamasoftware.services.restclient.jamadomain.values.PickListFieldValue;

public class PickListField extends JamaField {
    private int picklistId;
    private PickList pickList;

    public int getPicklistId() {
        return picklistId;
    }

    public void setPickList(PickList pickList) {
        this.pickList = pickList;
    }

    @Override
    public PickListFieldValue getValue() {
        PickListFieldValue pickListFieldValue = new PickListFieldValue();
        populateFieldValue(pickListFieldValue);
        return pickListFieldValue;
    }

    @Override
    public String getType() {
        return "PickList Field";
    }

    public PickList getPickList() {
        return pickList;
    }
}
