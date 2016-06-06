package cn.hxdev.platform.core.entity.storage;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by myhtls on 16/6/6.
 */
public class ResourceFolder extends SuperObject {

    private String name;
    private String apiLable;
    private String isStandard;
    private ResourceFolder parentResourceFolderId;

    @OneToMany(mappedBy = "resourceFolderId")
    private Collection<Resource> resources;

    public String getApiLable() {
        return apiLable;
    }

    public void setApiLable(String apiLable) {
        this.apiLable = apiLable;
    }

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceFolder getParentResourceFolderId() {
        return parentResourceFolderId;
    }

    public void setParentResourceFolderId(ResourceFolder parentResourceFolderId) {
        this.parentResourceFolderId = parentResourceFolderId;
    }

    public Collection<Resource> getResources() {
        return resources;
    }

    public void setResources(Collection<Resource> resources) {
        this.resources = resources;
    }
}
