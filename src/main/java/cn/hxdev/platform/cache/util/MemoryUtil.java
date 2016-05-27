package cn.hxdev.platform.cache.util;

public class MemoryUtil {

    private static CodeMapperAPI remoteAPI;
    private static CodeAPI localAPI;

    public static CodeMapperAPI getCacheAPI(String apiName) {
        return getCodeAPI(apiName);
    }

    public static CodeManagerAPI getManagerAPI(String apiName) {
        return getCodeAPI(apiName);
    }

    private static CodeAPI getCodeAPI(String apiName) {
        initial();
        if (localAPI == null) {
            // TODO    
            // MemoryCache cache = (MemoryCache) ServiceUtil.getService(apiName);
            // localAPI = new MemoryLoaderTemplate(cache, remoteAPI);
        }
        return localAPI;
    }

    private static void initial() {
        if (remoteAPI != null) {
            return;
        }
        // TODO
        //remoteAPI = (CodeMapperAPI) ServiceUtil.getService("memoryLoader");
    }

}
