package cn.hxdev.apps.cms.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 *
 * @author Javen Hao
 */
@Entity
public class CmsContent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private CmsMenu menu;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CmsContent")
    @OrderBy("id")
    private List<CmsAttachment> attacuments = new ArrayList<CmsAttachment>();

    private String subject;

    private String origin;

    @Lob
    private String content;

    private String summary;

    // 文章置顶级别
    private CmsContentTopLevel topLevel = null;

    private String seoKey;

    private String seoDescription;

    // 是否已删除
    private boolean deleted;

}
