package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class UserLicense extends SuperObject {
    
    private static final long serialVersionUID = 3777614081349551520L;
    
    // Developer, Administrator, PortalUser

    private String Name;
    private String Description;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}
