package chap_8;
import java.net.*;

public class Main3 {
	public static void main(String[] args) throws Exception{
		System.out.println("起動完了");
		ServerSocket svSocket = new ServerSocket(39648);
		Socket sock = svSocket.accept();
		System.out.println(sock.getInetAddress() + "からの接続");
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.close();
	}
}
