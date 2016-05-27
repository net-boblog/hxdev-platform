package cn.apphxdev.platform.utils;

import cn.apphxdev.platform.security.EncryptionType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 工具类来生成散列
 *
 * @author HXDEV.CN
 */
public class Encryption {

    /**
     * 基于java MessageDigest API返回一个字符串
     *
     * @param algorithm
     * @param string
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getMessageDigest(String algorithm, String string) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        byte[] hash = md.digest(string.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /**
     *返回一个基于MD5散列
     *
     * @param string
     * @param salt
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getMD5(String string, String salt) throws NoSuchAlgorithmException {
        if (salt != null) {
            string = salt + string;
        }
        return getMessageDigest(EncryptionType.MD5.getCode(), string);
    }

    /**
     * Return a hash based on MD5
     *
     * @param string
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getMD5(String string) throws NoSuchAlgorithmException {
        return getMD5(string, null);
    }

    /**
     * Return a hash based on SHA-256
     *
     * @param string
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getSHA256(String string) throws NoSuchAlgorithmException {
        return getMessageDigest(EncryptionType.SHA256.getCode(), string);
    }

    /**
     * Return a hash based on SHA-512
     *
     * @param string
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getSHA512(String string) throws NoSuchAlgorithmException {
        return getMessageDigest(EncryptionType.SHA512.getCode(), string);
    }

}
