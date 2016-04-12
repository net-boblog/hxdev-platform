package cn.hxdev.platform.core.entity;

import cn.hxdev.platform.core.entity.user.User;
import java.util.Date;

/**
 *
 * @author Javen
 */
public class SuperObject {

    private User createdBy;
    private Date createdDate;
    private User lastModifiedBy;
    private Date lastModifiedDate;

    public SuperObject() {
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
