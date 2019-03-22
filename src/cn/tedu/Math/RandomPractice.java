package cn.tedu.Math;
/*
 *随机获取一个六位数的验证码
 */
public class RandomPractice {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int j = 0;j<6 ;j++){	
		 
		arr[j] = (int) (Math.random()*10);
		
		}
		System.out.println(arr[0]*100000+arr[1]*10000+arr[2]*1000+arr[3]*100+arr[4]*10+arr[5]*1);
	}
}
