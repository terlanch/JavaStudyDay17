package cn.tedu.datedemo;
/*
 * ��ÿ���µĵ���������ǰ ����δ��ʼ ���콻�����ڽ��� �����Ժ����ѽ���
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticeDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�밴��ʽ�������ڣ���-��-�գ���");
		String str = sc.nextLine();
		//�ƶ����ڸ�ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//���ַ���תΪ���ڸ�ʽ
		Date date = sdf.parse(str);
		
		Calendar c = Calendar.getInstance();
		//����������ʱ��
		c.setTime(date);
		if((c.get(Calendar.WEEK_OF_MONTH) == 3)&& c.get(Calendar.DAY_OF_WEEK) == 7){
			System.out.println("�������ڽ���");
		}
		else if(((c.get(Calendar.WEEK_OF_MONTH) == 3)&& c.get(Calendar.DAY_OF_WEEK) < 7)||c.get(Calendar.WEEK_OF_MONTH)<3){
			System.out.println("����δ��ʼ");
		}
		else{
			System.out.println("�����ѽ���");
		}
	}
}
