package cn.tedu.Math;

import java.util.Arrays;

/*
 *�����⣺����2�����ֵĳ˻������������ֱַ���ǧλ���
 *˼·һ��BigInteger
 *˼·����������������Ϊ1000������ int[1000]�����洢��������
 *Ȼ���ٴ���һ������Ϊ2000������int[2000]�����洢���յĳ˻�
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
