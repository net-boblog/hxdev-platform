package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class CustomLabel extends SuperObject {
    
    private static final long serialVersionUID = -3331549469480973081L;

    private String Name;
    private String Value;
    private String Category;
    private String Description;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}
