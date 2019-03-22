package cn.tedu.exceptiondemo;
/*
 * ʹ��
 * try{
 * 		���ܳ����쳣�Ĵ���
 * }catch(�쳣���� �쳣������){
 * 		����д�����쳣�Ĵ���
 * }
 * �쳣����ķ�����
 * 1.����쳣����ʽ��ȫ��ͬ����ô����ʹ�ù�ͬ�ĸ�����в���
 * 2.����쳣����ʽ��ȫ��ͬ����ôֻ��һ��һ���Ĳ���
 * ��ֻ��ʹ��try..catch..catch�ķ�ʽ
 * 3.����쳣����ķ�ʽ������ͬ����ô����ʹ�÷��鲶��
 * ��catch�����С�����ָ�ʽ���£�
 * cathc(�쳣1|�쳣2|������ �쳣������)
 * 
 * ע��㣺���ж��һ����Ҫ����ʱ��ǰ��catch�е�һ�������Ǻ���cathc���쳣�ĸ��ࡣ
 * ���������쳣���������Զ���ᱻִ�С�
 * 
 * ����RuntimeException�Լ��������࣬�����쳣���Ǳ���ʱ�쳣
 */

public class ExceptionDemo2 {
	public static void main(String[] args)  {
		String str ;
		try {
			str = readTxt("P:a.txt ");
		} catch (PathNotExistException e) {
			// TODO Auto-generated catch block
			//��ӡջ�켣  
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("�������ִ���ˣ�����");
		
	}
	
	//����ȥĳһ���ļ����ж�ȡһ���ı���Ϣ
	public static String readTxt(String path) throws PathNotExistException{
		if(path.startsWith("P:")){
			//�׳�·���������쳣
			throw new PathNotExistException("·��������");
		}
		
		
		return "��ȡ�ı��ɹ���~";
	}
}


//�Զ����쳣
class PathNotExistException extends Exception{
	

	public PathNotExistException(String message) {
		// TODO Auto-generated constructor stub
		super(message) ;
	}
	
	
	
}