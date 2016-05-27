package cn.apphxdev.platform.cache.util;

import cn.apphxdev.platform.cache.MemoryCache;

public interface CodeManagerAPI {

    //key: startWith gettable#entityName 
    public <T> void reloadEntity(Class<T> entityClass);

    //key: startWith getcodetable#entityName
    public <T> void reloadCodeEntity(Class<T> entityClass);

    public MemoryCache getMemoryCache(String cacheName);

}
