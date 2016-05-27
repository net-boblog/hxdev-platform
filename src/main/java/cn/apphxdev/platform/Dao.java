package cn.apphxdev.platform;

import cn.apphxdev.platform.persistence.dao.BaseDaoImpl;

import javax.persistence.EntityManager;

/**
 * Created by myhtls on 16/4/14.
 */
public class Dao<T> extends BaseDaoImpl<T> {

    private EntityManager entityManager;

    public Dao(Class entityClass){
        super.setEntityClass(entityClass);
    }

    public Dao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Dao(Class entityClass,EntityManager entityManager){
        super.setEntityClass(entityClass);
        this.entityManager = entityManager;
    }

    public Dao(){}

    public void setEntityManager(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
