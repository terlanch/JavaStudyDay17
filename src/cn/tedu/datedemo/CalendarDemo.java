package cn.tedu.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//��ȡ��ǰʱ����Ĭ������
		Calendar c = Calendar.getInstance();
		//������
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		//ʱ
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"��");
		//��
		System.out.println(c.get(Calendar.MINUTE)+"��");
		//��
		System.out.println(c.get(Calendar.SECOND)+"��");
		//����������ʱ��
		c.set(2017, 3, 7, 12, 12,12);
		//������
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		
		//����������ĳһ������
		c.set(Calendar.YEAR, 2011);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		
		//����������ʱ�䣨�����������ڶ���
		c.setTime(new Date());
		
		//System.out.println(c);
	}
}
