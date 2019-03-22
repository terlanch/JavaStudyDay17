package cn.tedu.datedemo;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//过期的方法：旧版本的方法，不会进行维护，未来某一天可能无法使用
		//现在还可以正常使用
		//Date date = new Date(10,20,10);
		
		Date date = new Date();
		System.out.println(date);//Fri Mar 15 11:48:10 CST 2019
		
		Date date1 = new Date(1552622032123L);
		System.out.println(date1);
		
		
		//日期格式 可以让日期和字符串进行转换
		//
		//
	}
}
