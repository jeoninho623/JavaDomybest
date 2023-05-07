package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MySocketServer {
	public static void main(String[] args) {
		// 채팅 프로그램
		// 네트워크를 통해 메시지를 주고 받을땐 Socket 사용
		// IP와 Port (IP : 해당 컴퓨터의 주소, Port : 프로그램의 식별코드)
		// 클라이언트1 -- 서버 -- 클라이언트2
		MyClient user = new MyClient();
		user.start();
	}
}

class MyClient extends Thread{
	Socket socket;
	InputStream is;				// 서버의 메세지 받을때
	OutputStream os;			// 서버로 메세지를 보낼 때
	ObjectInputStream ois;		// 매핑
	ObjectOutputStream oos;		// 매핑
	
	// 임시입력용 Scanner
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		// 해당 컴퓨터와 연결 (IP, port)
		try {
			socket = new Socket("192.168.3.101", 8089);		// 소켓 생성 (이제부터 통신 가능)
			os = socket.getOutputStream();
			is = socket.getInputStream();
			oos = new ObjectOutputStream(os);				// 보낼 준비 완료
			ois = new ObjectInputStream(is);				// 받을 준비 완료
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 주고받고 무한반복
		while (true) {
			sendMessage();				// 버튼
			recvMessage();				// 무한반복
		}
	}
	
	// 서버로 메시지를 보내는 함수
	public void sendMessage() {
		System.out.println("보낼 메시지: ");
		String msg = sc.nextLine();
		
		try {
			oos.writeObject(msg);
			oos.flush();							// 버그방지 (보내고나서 쓰레기값이 남아있을 수도 있기 때문에 비워둠)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// 서버가 보내온 메시지를 받는 함수
	public void recvMessage() {
		String msg = "";
		
		try {
			msg = (String)ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();			// 임시용 출력
	}
}
