package cn.tedu.exceptiondemo;
/*
 * 异常对于重载没有影响
 * 
 * 异常对于重写的影响
 * 如果父类异常是子类异常的父类或相同，那么没有影响
 * 如果父类的异常是子类异常的子类，那么不能编译通过
 * 如果父类和子类异常不同并且没有父子类关系，那么不能编译通过
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