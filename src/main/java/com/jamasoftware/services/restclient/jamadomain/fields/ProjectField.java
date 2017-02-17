package com.jamasoftware.services.restclient.jamadomain.fields;
import com.jamasoftware.services.restclient.jamadomain.values.ProjectFieldValue;

public class ProjectField extends JamaField {
    @Override
    public ProjectFieldValue getValue() {
        ProjectFieldValue projectFieldValue = new ProjectFieldValue();
        populateFieldValue(projectFieldValue);
        return projectFieldValue;
    }

    @Override
    public String getType() {
        return "Project Field";
    }
}
