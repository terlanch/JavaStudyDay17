package cn.tedu.Math;

import java.util.Arrays;

/*
 *面试题：计算2个数字的乘积，这两个数字分别有千位组成
 *思路一：BigInteger
 *思路二：创建两个长度为1000的数组 int[1000]用来存储这两个数
 *然后再创建一个长度为2000的数组int[2000]用来存储最终的乘积
 */
public class PracticeDemo01 {
	public static void main(String[] args) {
		int arr1[] = new int[]{3,2,1};
		int arr2[] = new int[]{3,2,1};
		int arr3[] = new int[6];
		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				
				arr3[i+j] += arr1[i]*arr2[j];  
			}
		}
		System.out.println(Arrays.toString(arr3));
		for(int k = 0;k < arr3.length-1;k++){
			int temp = arr3[k];
			arr3[k] = temp % 10;
			arr3[k + 1] +=(temp / 10);
				
			
		}
		for(int n = arr3.length-1;n >= 0;n--){
			System.out.print(arr3[n]);
		}
		
		//System.out.println(Arrays.toString(arr3));
	}

}
