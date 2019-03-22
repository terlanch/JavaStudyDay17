package cn.tedu.datedemo;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*JDK1.8之后，java将日期时间信息进行了更详细的的划分
 * 分割出了一个新的包java.time
 * LocalDate
 * LocalTime
 * 
 */
public class LocalDemo {
	public static void main(String[] args) {
		//只和日期相关的类
		//获取当前的日期
//		LocalDate ld = LocalDate.now();
//		//指定日期时间
//		LocalDate ld1 = LocalDate.of(2000, 1, 1);
//		System.out.println(ld1);
//		
//		//加三天
//		ld = ld.plus(3,ChronoUnit.DAYS);
//		System.out.println(ld);
//		//减三年
//		ld = ld.minus(3,ChronoUnit.YEARS);
//		System.out.println(ld);
		
		//只和时间相关
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(3, 2,1);
		
		lt = lt.plus(3,ChronoUnit.HOURS);
		System.out.println(lt);
	}

}
