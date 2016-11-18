package com.jamasoftware.services.restclient.jamadomain.lazyresources;

import com.jamasoftware.services.restclient.jamadomain.JamaDomainObject;
import com.jamasoftware.services.restclient.jamadomain.JamaInstance;
import com.jamasoftware.services.restclient.jamadomain.fields.JamaField;
import com.jamasoftware.services.restclient.exception.UnexpectedJamaResponseException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JamaItemType extends LazyResource {
    private String typeKey;
    private String display;
    private String displayPlural;
    private String imageURL;
    private List<JamaField> fields = new ArrayList<>();
    private byte[] image;

    @Override
    protected String getResourceUrl() {
        return "itemtypes/" + getId();
    }

    @Override
    public void copyContentFrom(JamaDomainObject jamaDomainObject) {
        checkType(this.getClass(), jamaDomainObject);

        JamaItemType itemType = (JamaItemType) jamaDomainObject;
        typeKey = itemType.typeKey;
        display = itemType.display;
        displayPlural = itemType.displayPlural;
        imageURL = itemType.imageURL;
        fields = itemType.fields;
    }

    @Override
    public void associate(int id, JamaInstance jamaInstance) {
        super.associate(id, jamaInstance);
        for(JamaField field : fields) {
            field.setJamaInstance(jamaInstance);
        }
    }

    public String getTypeKey() {
        fetch();
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getDisplay() {
        fetch();
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplayPlural() {
        fetch();
        return displayPlural;
    }

    public void setDisplayPlural(String displayPlural) {
        this.displayPlural = displayPlural;
    }

    public byte[] getImage() {
        fetch();
        return image;
    }


    public String getImageURL() {
        fetch();
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<JamaField> getFields() {
        fetch();
        return fields;
    }

    public void setFields(List<JamaField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return getDisplay();
    }
}
