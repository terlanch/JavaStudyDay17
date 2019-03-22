package cn.tedu.datedemo;
/*
 * 在每个月的第三周周六前 交易未开始 当天交易正在进行 当日以后交易已结束
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticeDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请按格式输入日期（年-月-日）：");
		String str = sc.nextLine();
		//制定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//将字符串转为日期格式
		Date date = sdf.parse(str);
		
		Calendar c = Calendar.getInstance();
		//设置日历的时间
		c.setTime(date);
		if((c.get(Calendar.WEEK_OF_MONTH) == 3)&& c.get(Calendar.DAY_OF_WEEK) == 7){
			System.out.println("交易正在进行");
		}
		else if(((c.get(Calendar.WEEK_OF_MONTH) == 3)&& c.get(Calendar.DAY_OF_WEEK) < 7)||c.get(Calendar.WEEK_OF_MONTH)<3){
			System.out.println("交易未开始");
		}
		else{
			System.out.println("交易已结束");
		}
	}
}
