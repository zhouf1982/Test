package com.power.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.MessageDigest;

/**
 * @author power
 */
public class Md5 {
    private final static Logger logger = LogManager.getLogger(Md5.class);

    public static String md5(String text) throws Exception{
        String encodeStr = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("Md5");
            md5.update(text.getBytes("UTF-8"));
            byte[] md5Array = md5.digest();

            encodeStr = toHex(md5Array);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return encodeStr;
    }

    private static String toHex(byte[] bytes) {

        final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

        StringBuilder ret = new StringBuilder(bytes.length * 2);

        for (int i=0; i<bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }

        return ret.toString();
    }
}
