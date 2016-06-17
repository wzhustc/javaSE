package com.designpattern.Strategy;
/**
 * 客户端
 * @author ZhangWei
 *
 */
public class Client {
	
	public Strategy strategy;
	
	public static void main(String[] args) {
		Context context;
		
		context = new Context(new FirstIdea());
		
		System.out.println("此时使用第一个锦囊妙计");
		
		context.operate();
		
		context = new Context(new SecondIdea());
		
		System.out.println("刘备乐不思蜀，是时候使用第二个锦囊了！");
		
		context.operate();
		
		context = new Context(new ThirdIdea());
		
		System.out.println("最后一个锦囊登场");
		
		context.operate();
	}
}
