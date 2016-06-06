package cn.hxdev.platform.core.entity.storage;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.ManyToOne;

/**
 * Created by myhtls on 16/6/6.
 */
public class Resource extends SuperObject {

    private String name;
    private String path;
    private String isPublic;
    @ManyToOne
    private ResourceFolder resourceFolderId;

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ResourceFolder getResourceFolderId() {
        return resourceFolderId;
    }

    public void setResourceFolderId(ResourceFolder resourceFolderId) {
        this.resourceFolderId = resourceFolderId;
    }
}
