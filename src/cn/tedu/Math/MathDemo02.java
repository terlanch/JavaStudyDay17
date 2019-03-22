package cn.tedu.Math;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * BigDecimal(��ʮ����)-->���ھ�ȷ�������
 * ���봫���ַ����������޷���ȷ����
 * 
 * BigInteger -->���ڽ��д������ֵĴ洢�ͼ���
 */

public class MathDemo02 {
	public static void main(String[] args) {
		double d= 3.0;
		double d1 = 2.99;
		System.out.println(d - d1);//0.009999999
	
	
	BigDecimal bd1 = new BigDecimal("3.0");
	BigDecimal bd2 = new BigDecimal("2.33");
	System.out.println(bd1.subtract(bd2));
	
	
	BigInteger bi1 = new BigInteger("23123131233123231231231265371527351623152735172537162537152735172537125732175371253752173");
	BigInteger bi2 = new BigInteger("287391723912936126873621863812638682137162831872638612863821683618263812683681236816283681268362183681628361826381268316823");
	System.out.println(bi1.multiply(bi2));
	}
}
