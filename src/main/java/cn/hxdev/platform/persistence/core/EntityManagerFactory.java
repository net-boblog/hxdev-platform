package cn.hxdev.platform.persistence.core;

import javax.persistence.EntityManager;

/**
 * Created by myhtls on 16/5/27.
 */
public interface EntityManagerFactory {

    public EntityManager getEntityManager();

}
