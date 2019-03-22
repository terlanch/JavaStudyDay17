package cn.tedu.exceptiondemo;
/*
 * try{
 * }catch(异常 ){
 * }finally{
 * 		这里的代码一定会被执行
 * }
 */
public class FinallyDemo {
	public static void main(String[] args) {
//		try{
//			System.out.println(1/0);
//		}catch(Exception e){
//			
//		}finally{
//			System.out.println("over");
//		}
		
		System.out.println(demo02());
	}
//	public static int demo(){
//		try{
//			return 1;
//		}finally{
//			return 2;
//		}
//	}
	
	public static int demo02(){
		int i = 7;
		try{
			return i++;
		}finally{
			 i++;
			 
			 System.out.println("i="+i);
		}//当finally执行完毕时，再将return 7 返回main
	}
}
