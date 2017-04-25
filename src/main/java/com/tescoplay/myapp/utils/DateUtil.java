package com.tescoplay.myapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ת������
 */
public class DateUtil
{
	/**
     * yyyy-MM-dd
     */
    public static final String DATE_PATTERN_DEFAULT = "yyyy-MM-dd";
	/**
	 * ��Timestamp���͵�����ת��Ϊϵͳ��������ĸ�ʽ���ַ�����
	 * @param d
	 * @return
	 */
    public static String formatDate(Date d)
    {
      return format(d, DATE_PATTERN_DEFAULT);
    }


	/**
	 * ��Date���͵�����ת��Ϊϵͳ��������ĸ�ʽ���ַ�����
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