package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class UserRole extends SuperObject {
    
    private static final long serialVersionUID = 5174947774781000077L;

    private String Name;
    private String Description;
    private UserRole ParentRoleId;

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

    public UserRole getParentRoleId() {
        return ParentRoleId;
    }

    public void setParentRoleId(UserRole ParentRoleId) {
        this.ParentRoleId = ParentRoleId;
    }

}
