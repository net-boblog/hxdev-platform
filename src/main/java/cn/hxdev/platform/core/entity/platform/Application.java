package cn.hxdev.platform.core.entity.platform;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.*;
import java.util.Collection;

/**
 * 定制化－创建－应用程序
 * @author Javen
 */
@NamedQueries({
        @NamedQuery(name = "Application.findAll",query = "select app from Application app order by app.labelName desc")
})
@Entity
@Table(name = "application")
public class Application extends SuperObject implements java.io.Serializable{

    public final static String FINDALL = "Application.findAll";

    private String labelName;
    private String apiName;
    private String Description;
    /**
     * 1:是  0:否
     */
    private String isStandard;

    /**
     * 1：是  0:否
     */
    private String isDeployed;


    @ManyToMany(mappedBy = "applications")
    private Collection<CustomeObject> customeObjects;

    @ManyToMany(mappedBy = "applications")
    private Collection<AppTabs> appTabses;

    public Application() {

    }

    public Collection<AppTabs> getAppTabses() {
        return appTabses;
    }

    public void setAppTabses(Collection<AppTabs> appTabses) {
        this.appTabses = appTabses;
    }

    public Collection<CustomeObject> getCustomeObjects() {
        return customeObjects;
    }

    public void setCustomeObjects(Collection<CustomeObject> customeObjects) {
        this.customeObjects = customeObjects;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIsDeployed() {
        return isDeployed;
    }

    public void setIsDeployed(String isDeployed) {
        this.isDeployed = isDeployed;
    }

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
