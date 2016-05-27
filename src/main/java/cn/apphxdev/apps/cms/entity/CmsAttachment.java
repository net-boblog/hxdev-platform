package cn.apphxdev.apps.cms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Javen
 */
@Entity
public class CmsAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private String url;
    
     @ManyToOne
    private CmsContent content = null;
     
    private String mimeType;
    
    private boolean privatized;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CmsContent getContent() {
        return content;
    }

    public void setContent(CmsContent content) {
        this.content = content;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public boolean isPrivatized() {
        return privatized;
    }

    public void setPrivatized(boolean privatized) {
        this.privatized = privatized;
    }
    
    
    
    
}
