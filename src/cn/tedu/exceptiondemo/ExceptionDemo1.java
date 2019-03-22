package cn.tedu.exceptiondemo;
/*
 * Throwable所有错误和异常的顶级父类
 * Error:错误表示程序中出现了非常非常严重的问题，
 * 不修改代码不能继续执行，必须停止程序进行修改
 * Exception:异常表示程序中出现了不太严重的问题，
 * 处理异常后可以继续向下执行代码
 * 
 * 异常分为两大类：
 * 1.编译时异常：在编译期间出现的异常，必须在编译期间处理掉
 * （1.向上抛 2.捕获处理），否则编译不通过
 * 出现异常一层一层的向上抛异常，最终到JVM处
 * 
 * 
 * 2.运行时异常：在编译期间没有异常，在运行期间出现的异常
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1};
		getElement(null);
		//代码的健壮性-->方法能否经得住多重考验
	}
	public static int getElement(int[] arr){
//		if(arr.length == 0 || arr.length <= 6){
//			throw new ArrayIndexOutOfBoundsException("这里不能乱用索引");
//			
//		}
		if(arr == null){
			throw new NullPointerException("数组不能为null");
		}
		
		
		return arr[6];
	}
}
