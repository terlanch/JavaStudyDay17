package cn.tedu.exceptiondemo;
/*
 * �쳣��������û��Ӱ��
 * 
 * �쳣������д��Ӱ��
 * ��������쳣�������쳣�ĸ������ͬ����ôû��Ӱ��
 * ���������쳣�������쳣�����࣬��ô���ܱ���ͨ��
 * �������������쳣��ͬ����û�и������ϵ����ô���ܱ���ͨ��
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		
	}
}


class A{
	public void m()throws IOException{
		
	}
	
	public void m(int i)throws FileNotFoundException{
		
	}
}

class B extends A{
	public void m()throws FileNotFoundException{
		
	}
}