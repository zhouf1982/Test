package com.zhoufeng.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhoufeng
 */
public class DataFormat {
    final static Logger logger = LogManager.getLogger(DataFormat.class);

    public static Integer getIntegerFormObj(Object object) {
        if (null == object) {
            return null;
        }

        if ("".equals(object.toString())) {
            return null;
        }

        return Integer.valueOf(object.toString());
    }

    public static BigDecimal getBigDecimalFormObj(Object object) {
        if (null == object) {
            return null;
        }

        if ("".equals(object.toString())) {
            return null;
        }

        return new BigDecimal(object.toString());
    }

    public static String getStringFromFormat(String text, String format) {
        String str = "";

        int strLen = text.length();

        if (strLen <= format.length()) {
            str = new StringBuilder(format.substring(0, format.length() - strLen)).append(text).toString();
        }
        return str;
    }

    public static String getStrFormTimestamp(Timestamp timestamp) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(timestamp);
    }

    public static Date getDateFromStrShort(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        try {
            date = format.parse(text);
        } catch (ParseException e) {
            logger.error(e.getMessage());
        }

        return date;
    }

    public static String getStrFormDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String ret = null;

        try {
            ret = format.format(date);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return null;
    }

    public static Date getDateFromStr(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        try {
            date = format.parse(text);
        } catch (ParseException e) {
            logger.error(e.getMessage());
        }

        return date;
    }

    public static Timestamp getTimestampFromStr(String text) {
        return Timestamp.valueOf(text);
    }
}
