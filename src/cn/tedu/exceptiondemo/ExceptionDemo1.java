package cn.tedu.exceptiondemo;
/*
 * Throwable���д�����쳣�Ķ�������
 * Error:�����ʾ�����г����˷ǳ��ǳ����ص����⣬
 * ���޸Ĵ��벻�ܼ���ִ�У�����ֹͣ��������޸�
 * Exception:�쳣��ʾ�����г����˲�̫���ص����⣬
 * �����쳣����Լ�������ִ�д���
 * 
 * �쳣��Ϊ�����ࣺ
 * 1.����ʱ�쳣���ڱ����ڼ���ֵ��쳣�������ڱ����ڼ䴦���
 * ��1.������ 2.��������������벻ͨ��
 * �����쳣һ��һ����������쳣�����յ�JVM��
 * 
 * 
 * 2.����ʱ�쳣���ڱ����ڼ�û���쳣���������ڼ���ֵ��쳣
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1};
		getElement(null);
		//����Ľ�׳��-->�����ܷ񾭵�ס���ؿ���
	}
	public static int getElement(int[] arr){
//		if(arr.length == 0 || arr.length <= 6){
//			throw new ArrayIndexOutOfBoundsException("���ﲻ����������");
//			
//		}
		if(arr == null){
			throw new NullPointerException("���鲻��Ϊnull");
		}
		
		
		return arr[6];
	}
}
