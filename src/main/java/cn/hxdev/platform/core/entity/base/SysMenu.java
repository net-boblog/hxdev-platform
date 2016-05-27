package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class SysMenu extends SuperObject {
    
    private static final long serialVersionUID = -2496856862228425715L;

    private String Name;
    private String Sequence;
    private String Description;
    private SysMenu ParentMenuId;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSequence() {
        return Sequence;
    }

    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public SysMenu getParentMenuId() {
        return ParentMenuId;
    }

    public void setParentMenuId(SysMenu ParentMenuId) {
        this.ParentMenuId = ParentMenuId;
    }

}
