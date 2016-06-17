package com.lesson6;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		int[] count = new int[41];
		for (int i = 0; i < 50; i++) {
			//随机生成10-50的数字
			int number = random.nextInt(40) + 10;
			//打印随机生成的10-50的数字
			System.out.println(number);
			//把对应的数字出现的次数放到相应的数组单元中，减10是为了和数组的下标对齐
			count[number - 10]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (0 == count[i]) {
				continue;
			}
			System.out.println((10 + i) + "出现次数："+ count[i]);
		}
		
		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			if(max < count[i])
			{
				max = count[i];
			}
		}
		
		System.out.println("出现的最大次数为：" +  max + "次");

		for(int i = 0; i < count.length; i++)
		{
			if(max == count[i])
			{
				System.out.println(i + 10);	
			}
		}
	}
}
