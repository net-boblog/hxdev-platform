package cn.apphxdev.platform.localization.i18n;

import java.util.Locale;

/**
 *
 * @author HXDEV.CN
 */
public class HxdevResourceBundle {

    public static final String CORE_BUNDLE_PATH = "cn.hxdev.messages";

    public static String get(String key) {
        return ResourceBundleUtils.get(key, CORE_BUNDLE_PATH);
    }
    
    public static String get(String key, Locale locale) {
        return ResourceBundleUtils.get(key, CORE_BUNDLE_PATH, HxdevResourceBundle.class.getClassLoader(), locale);
    }

    public static String get(String key, Locale locale, Object... array) {
        return ResourceBundleUtils.get(key, CORE_BUNDLE_PATH, HxdevResourceBundle.class.getClassLoader(), locale, array);
    }

    public static String get(String key, Object... array) {
        return ResourceBundleUtils.get(key, CORE_BUNDLE_PATH, HxdevResourceBundle.class.getClassLoader(), array);
    }
}
