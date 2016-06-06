package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 组织
 * Created by myhtls on 16/6/6.
 */
@Entity
@Table(name = "organization")
public class Organization extends SuperObject {

    private String name;
    private String companyEmail;

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
