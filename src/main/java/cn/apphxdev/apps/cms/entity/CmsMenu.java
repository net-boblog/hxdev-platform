package cn.apphxdev.apps.cms.entity;

import cn.apphxdev.platform.core.entity.SuperObject;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Transient;

/**
 *
 * @author Javen
 */
@Entity
public class CmsMenu extends SuperObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, insertable = true, updatable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parentMenuId")
    private CmsMenu parentMenu;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parentMenu")
    @OrderBy("id")
    private List<CmsMenu> childMenus = new ArrayList<CmsMenu>();

    private Integer sequence;

    private String description;

    @Enumerated(EnumType.STRING)
    private CmsContentType contentType;

    private boolean actived;

    @Transient
    private boolean canExpand;

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

    public CmsMenu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(CmsMenu parentMenu) {
        this.parentMenu = parentMenu;
    }

    public List<CmsMenu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<CmsMenu> childMenus) {
        this.childMenus = childMenus;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CmsContentType getContentType() {
        return contentType;
    }

    public void setContentType(CmsContentType contentType) {
        this.contentType = contentType;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public boolean isCanExpand() {
        return canExpand;
    }

    public void setCanExpand(boolean canExpand) {
        this.canExpand = canExpand;
    }

}
