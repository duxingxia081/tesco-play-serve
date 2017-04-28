package com.tescoplay.myapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具
 */
public class DateUtil
{
	/**
     * yyyy-MM-dd
     */
    public static final String DATE_PATTERN_DEFAULT = "yyyy-MM-dd";
	/**
	 * 将Timestamp类型的日期转换为系统参数定义的格式的字符串。
	 * @param d
	 * @return
	 */
    public static String formatDate(Date d)
    {
      return format(d, DATE_PATTERN_DEFAULT);
    }


	/**
	 * 将Date类型的日期转换为系统参数定义的格式的字符串。
	 * @param d
	 * @param pattern
	 * @return
	 */
    public static String format(Date d, String pattern)
    {
      if (d == null)
        return null;

      SimpleDateFormat dateFromat = new SimpleDateFormat(pattern);
		return dateFromat.format(d);
    }
}