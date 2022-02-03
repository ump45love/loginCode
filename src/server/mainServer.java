package server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class mainServer {
	public static void socket() throws IOException {
		ServerSocket s_socket = new ServerSocket(8888);
		Socket c_socket = s_socket.accept();
		OutputStream output_data = c_socket.getOutputStream();
		String sendData = "Hi";
		output_data.write(sendData.getBytes());
		s_socket.close();
		c_socket.close();
	}
}
