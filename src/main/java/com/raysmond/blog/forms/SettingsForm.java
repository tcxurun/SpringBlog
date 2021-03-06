package com.raysmond.blog.forms;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Raysmond on 9/27/15.
 */
public class SettingsForm {
    @NotEmpty
    private String siteName;

    private String siteSlogan;

    private Integer pageSize;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSiteSlogan() {
        return siteSlogan;
    }

    public void setSiteSlogan(String siteSlogan) {
        this.siteSlogan = siteSlogan;
    }

}
