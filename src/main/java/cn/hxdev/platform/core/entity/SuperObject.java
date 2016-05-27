package cn.hxdev.platform.core.entity;

import java.io.Serializable;
import java.util.Date;
import cn.hxdev.platform.core.entity.base.User;
import javax.persistence.Version;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

/**
 *
 * @author Javen
 */
@MappedSuperclass
public abstract class SuperObject implements Serializable {
    private static final long serialVersionUID = 6152279535795420730L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    
    @Version
    protected Long version;
    
    protected User createdBy;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date createdDate;
    
    
    protected User lastModifiedBy;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date lastModifiedDate;

    public SuperObject() {
    }

    // --- Overrides
    // Check this video: https://www.youtube.com/watch?v=E-LG5DlOKBw
    // Check & Override Hash method.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        final SuperObject other = (SuperObject) obj;
        if ((null != id) && (null == other.getId())) {
            return false;
        }
        if ((null == id) && (null != other.getId())) {
            return false;
        }
        if (id.longValue() != other.getId().longValue()) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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
