package cn.apphxdev.platform.cache.spi;

import cn.apphxdev.platform.cache.util.MultiValueKey;
import cn.apphxdev.platform.utils.MultiValueMap;


public class MemoryLoaderImpl implements MemoryLoader {

	@Override
	public <T> String code2Name(Class<T> entity, String codeFieldName,String valueFieldName, String code) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.code2Name(entity, codeFieldName, valueFieldName, code);
	}

	@Override
	public <T> String code2Name(Class<T> entity, String[] codeFieldNames,String valueFieldName, String[] codes) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.code2Name(entity, codeFieldNames, valueFieldName, codes) ;
	}

	@Override
	public <T> MultiValueMap<MultiValueKey, Object> getTable(Class<T> entity,String keyFieldName) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.getTable(entity, keyFieldName) ;
	}

	@Override
	public <T> MultiValueMap<MultiValueKey, Object> getTable(Class<T> entity,String... keyFieldNames) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.getTable(entity, keyFieldNames) ;
	}

	@Override
	public <T> MultiValueMap<MultiValueKey, String> getCodeTable(Class<T> entity, String codeFieldName, String valueFieldName) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.getCodeTable(entity, codeFieldName, valueFieldName) ;
	}

	@Override
	public <T> MultiValueMap<MultiValueKey, String> getCodeTable(Class<T> entity, String[] codeFieldNames, String valueFieldName) {
		EntityCacheDao dao = null ;// (EntityCacheDao) ServiceUtil.getService("entityCacheDao");
		return dao.getCodeTable(entity, codeFieldNames, valueFieldName);
	}


}
