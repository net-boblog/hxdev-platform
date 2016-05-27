package cn.apphxdev.apps.cms.query;

import cn.apphxdev.apps.cms.entity.CmsContentTopLevel;

/**
 *
 * @author Javen
 */
public final class CmsQueryBuild {

    private CmsQueryBuild queryBuild;

    public CmsQueryBuild() {
        queryBuild = getInstance();
    }

    public CmsQueryBuild getInstance() {
        if (queryBuild == null) {
            queryBuild = new CmsQueryBuild();
        }
        return queryBuild;
    }

    public CmsQueryBuild addFilterTopLevel(CmsContentTopLevel level) {
        return null;
    }

}
