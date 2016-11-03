package com.lesson.thread.producer;
/**
 * 仓库类，用来生产和消费的一个共享区。生产者生产好放进来，消费者从这里面取出去消费。
 * @author ZhangWei
 *
 */
public class Base {
	private static final int MAX_SIZE = 100;//仓库总量
	public int curnum;//当前库存量
	
	public Base() {
		
	}
	
	public Base(int curnum) {
		this.curnum = curnum;
	}
	/**
	 * 生产产品，要加锁
	 */
	public synchronized void produce(int neednum) {
		
		//当目前的库存+生产的产品 > 总库存时，仓库已满，生产者需要等待。
		while(curnum + neednum > MAX_SIZE) {
			System.out.println("需要生产：" + neednum + " 产品， 目前的存储是：" + curnum);
			System.out.println("已经超过库存的总量：" + (curnum + neednum - MAX_SIZE) + "个，生产进程等待...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//否则的话，将生产的产品加入到当前的库存中
		curnum += neednum;
		System.out.println("已经生产了：" + neednum + "个产品， 目前总量是：" + curnum);
		//仓库已满时，唤醒消费者进程来消费
		notifyAll();
	}
	
	/**
	 * 消费产品，需要加锁
	 */
	
	public synchronized void consume(int neednum) {
		
		//当库存量比消费的量要少时，表示仓库产品已经不够消费了，进程就等待
		while(curnum - neednum < 0) {
			System.out.println("需要消费的产品数：" + neednum + " 个， 库存量是：" + curnum);
			System.out.println("库存目前不足，还差：" + (neednum - curnum) + "个产品。消费进程需等待....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//否则的话，从仓库中消费掉neednum个产品
		curnum -= neednum;
		System.out.println("已经消费了：" + neednum + "个产品, 目前库存是：" + curnum);
		//唤醒生产进程，仓库产品数量告急，快生产产品
		notifyAll();
	}
}
