package cn.hxdev.platform.core.entity.platform;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.*;
import java.util.Collection;

/**
 *定制化－创建－应用tab项
 * @author Javen
 */

@Entity
@Table(name = "appTabs")
public class AppTabs  extends SuperObject {

    private String labelName;
    private String apiName;
    private String tabType;

    @OneToOne(fetch = FetchType.LAZY)
    private CustomeObject customeObject;

    @JoinTable(name = "applicationTabs",joinColumns = @JoinColumn(name = "appTabsId"),inverseJoinColumns = @JoinColumn(name = "ApplicationId"))
    @ManyToMany
    private Collection<Application> applications;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Collection<Application> getApplications() {
        return applications;
    }

    public void setApplications(Collection<Application> applications) {
        this.applications = applications;
    }

    public CustomeObject getCustomeObject() {
        return customeObject;
    }

    public void setCustomeObject(CustomeObject customeObject) {
        this.customeObject = customeObject;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getTabType() {
        return tabType;
    }

    public void setTabType(String tabType) {
        this.tabType = tabType;
    }
}
