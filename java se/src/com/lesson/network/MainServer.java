package com.lesson.network;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(4000);
		
		while(true) {
			Socket socket = ss.accept();
			
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
		}
	}
}
