package com.zhoufeng.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Base64;

public class UtilHelper {
    private final static Logger logger = LogManager.getLogger(UtilHelper.class);

    /**
     * 中文转unicode
     * @param gbString 入
     * @return 出
     */
    public static String gbEncoding(final String gbString) {
        //utfBytes = [测, 试]
        char[] utfBytes = gbString.toCharArray();
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            //转换为16进制整型字符串
            String hexB = Integer.toHexString(utfBytes[byteIndex]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        System.out.println("unicodeBytes is: " + unicodeBytes);
        return unicodeBytes;
    }

    /**
     * Unicode转中文
     * @param dataStr 入
     * @return 出
     */
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            // 16进制parse整形字符串
            char letter = (char) Integer.parseInt(charStr, 16);
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }

    public static String byte2Base64String(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String md5EncryptAndBase64(String str) {
        try {
            return encodeBase64(md5Encrypt(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String encodeBase64(byte[] b) {
        String str = Base64.getEncoder().encodeToString(b).toString();

        return str;
    }

    public static String base64String2String(String str) {
        try {
            return new String(Base64.getDecoder().decode(str),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.debug(e.getMessage());
            return "";
        }
    }

    private static byte[] md5Encrypt(String encryptStr) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("Md5");
            md5.update(encryptStr.getBytes("utf8"));
            return md5.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public static String md5Short(String text) throws Exception {
//        return md5Encrypt(text).substring(8,24);
//    }
//
//    public static String md5Encrypt(String text) throws Exception{
//        String encodeStr = "";
//        try {
//            MessageDigest md5 = MessageDigest.getInstance("Md5");
//            md5.update(text.getBytes("UTF-8"));
//            byte[] md5Array = md5.digest();
//
//            encodeStr = toHex(md5Array);
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//        }
//
//        return encodeStr;
//    }
//
//    private static String toHex(byte[] bytes) {
//
//        int i;
//        StringBuffer buffer = new StringBuffer("");
//        for (int offset = 0; offset < bytes.length; offset++) {
//            i = bytes[offset];
//            if (i < 0) {
//                i += 256;
//            }
//            if (i < 16) {
//                buffer.append("0");
//            }
//            buffer.append(Integer.toHexString(i));
//        }
//
//        return buffer.toString();
//    }
}
