package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class UserProfile extends SuperObject {
    
    private static final long serialVersionUID = -4591665574029152369L;
    
    private	String	Name;
    private	String	Description;
    private	String	UserLicenseId;

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

    public String getUserLicenseId() {
        return UserLicenseId;
    }

    public void setUserLicenseId(String UserLicenseId) {
        this.UserLicenseId = UserLicenseId;
    }
    
    
    
}
