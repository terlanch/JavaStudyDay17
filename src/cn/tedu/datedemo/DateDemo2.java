package cn.tedu.datedemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
	public static void main(String[] args) throws ParseException {
		//y比较智能，如果是yyy和y依然正常显示
		//yy只显示年份的后两位
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
//		//要把当前系统时间转换为
//		//格式：2019年03月15日 14点22分55秒
//		
//		//将日期转换为字符串
//		String s = sdf.format(new Date());
//		System.out.println(s);
		
 		
		//将字符串转换为日期
		//如果没有时分秒 默认都是0
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf1.parse("2019-03-15");
		System.out.println(date);
	}
}
