package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Javen
 */
@NamedQueries({
        @NamedQuery(name = "SysMenu.findSysMenuByRoot",query = "select sysMenu from SysMenu sysMenu where sysMenu.parentMenuId=0 order by sysMenu.sequence desc"),
        @NamedQuery(name = "SysMenu.findSysMenuByParentId",query = "select sysMenu from SysMenu sysMenu where sysMenu.parentMenuId=:parentMenuId order by sysMenu.sequence desc"),
        @NamedQuery(name="SysMenu.findSysMenuByName",query = "select sysMenu from SysMenu sysMenu where sysMenu.name=:name and sysMenu.parentMenuId=:parentMenuId")
})
@Table(name="sysmenu")
@Entity
public class SysMenu extends SuperObject implements java.io.Serializable,Cloneable {

    public final static String ROOT = "SysMenu.findSysMenuByRoot";
    public final static String CHILDREN = "SysMenu.findSysMenuByParentId";
    public final static String OLDNAME = "SysMenu.findSysMenuByName";
    private static final long serialVersionUID = -2496856862228425715L;
    private static SysMenu PUSYSMENU = new SysMenu();

    /**
     * 克隆创建一个bean
     * @return
     */
    public static SysMenu createPuSysMenu(){
        try {
            return (SysMenu) PUSYSMENU.clone();
        }catch(CloneNotSupportedException cnse){}
        return null;
    }

    @NotNull
    @Column(name = "name",length = 255)
    private String name;

    @Column(name = "sequence",length = 1)
    private  int	sequence;

    @Column(name = "description",length = 2550)
    private String description;

    @Column(name = "parentMenuId",length = 255)
    private long parentMenuId;

    @Column(name = "icon",length = 200)
    private String icon;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }



    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
