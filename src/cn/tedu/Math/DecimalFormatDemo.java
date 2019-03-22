package cn.tedu.Math;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		// 2.1  02.10
		double d = 2.87*2.61;
		System.out.println(d);
		//0代表占位符，如果没有数字，那么使用0进行站位
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println(df.format(d));
		
		// 2.1  2.1
		//#占位符。如果有数字，正常显示，如果没有数字，不显示
		DecimalFormat df1 = new DecimalFormat("#0.00");
		System.out.println(df1.format(d));
		
		//科学计数法
		long l = 104335L;
		DecimalFormat df2 = new DecimalFormat("0.00E0");
		System.out.println(df2.format(l));
	}
}
