package cn.tedu.datedemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
	public static void main(String[] args) throws ParseException {
		//y�Ƚ����ܣ������yyy��y��Ȼ������ʾ
		//yyֻ��ʾ��ݵĺ���λ
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm��ss��");
//		//Ҫ�ѵ�ǰϵͳʱ��ת��Ϊ
//		//��ʽ��2019��03��15�� 14��22��55��
//		
//		//������ת��Ϊ�ַ���
//		String s = sdf.format(new Date());
//		System.out.println(s);
		
 		
		//���ַ���ת��Ϊ����
		//���û��ʱ���� Ĭ�϶���0
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf1.parse("2019-03-15");
		System.out.println(date);
	}
}
