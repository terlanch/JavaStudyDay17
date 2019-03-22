package cn.tedu.exceptiondemo;
/*
 * 使用
 * try{
 * 		可能出现异常的代码
 * }catch(异常类名 异常变量名){
 * 		可以写处理异常的代码
 * }
 * 异常捕获的方法：
 * 1.如果异常处理方式完全相同，那么可以使用共同的父类进行捕获
 * 2.如果异常处理方式完全不同，那么只能一个一个的捕获
 * 。只能使用try..catch..catch的方式
 * 3.如果异常处理的方式部分相同，那么可以使用分组捕获。
 * 在catch后面的小括号种格式如下：
 * cathc(异常1|异常2|。。。 异常变量名)
 * 
 * 注意点：当有多个一场需要捕获时，前面catch中的一场不能是后面cathc中异常的父类。
 * 否则后面的异常捕获代码永远不会被执行。
 * 
 * 除了RuntimeException以及它的子类，其他异常都是编译时异常
 */

public class ExceptionDemo2 {
	public static void main(String[] args)  {
		String str ;
		try {
			str = readTxt("P:a.txt ");
		} catch (PathNotExistException e) {
			// TODO Auto-generated catch block
			//打印栈轨迹  
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("代码继续执行了？？？");
		
	}
	
	//代表去某一个文件夹中读取一个文本信息
	public static String readTxt(String path) throws PathNotExistException{
		if(path.startsWith("P:")){
			//抛出路径不存在异常
			throw new PathNotExistException("路径不存在");
		}
		
		
		return "读取文本成功啦~";
	}
}


//自定义异常
class PathNotExistException extends Exception{
	

	public PathNotExistException(String message) {
		// TODO Auto-generated constructor stub
		super(message) ;
	}
	
	
	
}