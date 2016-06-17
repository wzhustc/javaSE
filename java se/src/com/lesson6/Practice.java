package com.lesson6;

public class Practice {
	public static void main(String[] args) {
//		Random random = new Random();
		
		for (int i = 0; i < 50; i++) {
//			System.out.print(random.nextInt(41) + 10 + "  ");
			
			double result = Math.random();  //生成0.0 <= n < 1.0
			result *= 41;					//生成0.0 <= n < 41.0
			int result2 = (int)result;		//生成0 <= n < 41
			result2 += 10;					//生成10 <= n <51 即10<=n<=50
			System.out.println(result2);
		}
	}
}
