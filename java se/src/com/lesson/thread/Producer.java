package com.lesson.thread;

public class Producer extends Thread {
		
		private int num;
		private Storage storage;
		
		public Producer(Storage storage) {
			this.storage = storage;
		}
		
		@Override
		public void run() {
			storage.produce(num);		
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public Storage getStorage() {
			return storage;
		}

		public void setStorage(Storage storage) {
			this.storage = storage;
		}
		
}
