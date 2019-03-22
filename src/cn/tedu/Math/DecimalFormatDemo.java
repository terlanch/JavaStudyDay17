package cn.tedu.Math;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		// 2.1  02.10
		double d = 2.87*2.61;
		System.out.println(d);
		//0����ռλ�������û�����֣���ôʹ��0����վλ
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println(df.format(d));
		
		// 2.1  2.1
		//#ռλ������������֣�������ʾ�����û�����֣�����ʾ
		DecimalFormat df1 = new DecimalFormat("#0.00");
		System.out.println(df1.format(d));
		
		//��ѧ������
		long l = 104335L;
		DecimalFormat df2 = new DecimalFormat("0.00E0");
		System.out.println(df2.format(l));
	}
}
