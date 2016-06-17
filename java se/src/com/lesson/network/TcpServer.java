package com.lesson.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(3000);
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		
		byte[] buffer = new byte[200];
		int length = is.read(buffer);
		System.out.println(new String(buffer, 0, length));
		
		
//		while (-1 != (length = is.read(buffer, 0, buffer.length))) {
//			String str = new String(buffer, 0, length);
//			System.out.println(str);
//		}
		
		OutputStream os = socket.getOutputStream();
		
		os.write("welcome!".getBytes());
		
		is.close();
		os.close();
		socket.close();
		
	}
}
