package cn.tedu.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//获取当前时区的默认日历
		Calendar c = Calendar.getInstance();
		//年月日
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		//时
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"点");
		//分
		System.out.println(c.get(Calendar.MINUTE)+"分");
		//秒
		System.out.println(c.get(Calendar.SECOND)+"秒");
		//设置日历的时间
		c.set(2017, 3, 7, 12, 12,12);
		//年月日
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		
		//设置日历的某一个属性
		c.set(Calendar.YEAR, 2011);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		
		//设置日历的时间（参数传入日期对象）
		c.setTime(new Date());
		
		//System.out.println(c);
	}
}
