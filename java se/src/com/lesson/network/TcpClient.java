package com.lesson.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("localhost", 3000);
		
		OutputStream os = socket.getOutputStream();
		
		os.write("hello, world".getBytes());
		
		InputStream is = socket.getInputStream();
		
		byte[] buffer = new byte[200];

		int length = is.read(buffer);
		System.out.println(new String(buffer, 0, length));
		
//		int length = 0;
//		
//		while (-1 != (length = is.read(buffer, 0, buffer.length))) {
//			String str = new String(buffer, 0, length);
//			System.out.println(str);
//		}
		os.close();
		is.close();
		socket.close();
	}
}
