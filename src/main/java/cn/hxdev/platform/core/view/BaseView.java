package cn.hxdev.platform.core.view;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Javen
 */
public abstract class BaseView implements Serializable {

    protected static final long serialVersionUID = 1L;

    @Inject
    protected EntityManager em;
    
    @Inject
    protected Logger log;

}
