package cn.tedu.datedemo;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*JDK1.8֮��java������ʱ����Ϣ�����˸���ϸ�ĵĻ���
 * �ָ����һ���µİ�java.time
 * LocalDate
 * LocalTime
 * 
 */
public class LocalDemo {
	public static void main(String[] args) {
		//ֻ��������ص���
		//��ȡ��ǰ������
//		LocalDate ld = LocalDate.now();
//		//ָ������ʱ��
//		LocalDate ld1 = LocalDate.of(2000, 1, 1);
//		System.out.println(ld1);
//		
//		//������
//		ld = ld.plus(3,ChronoUnit.DAYS);
//		System.out.println(ld);
//		//������
//		ld = ld.minus(3,ChronoUnit.YEARS);
//		System.out.println(ld);
		
		//ֻ��ʱ�����
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(3, 2,1);
		
		lt = lt.plus(3,ChronoUnit.HOURS);
		System.out.println(lt);
	}

}
