package multiThreading;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드 환경에서
		// '동기화' synchronized
		// 클래스를 동기화해서 이미 실행중인 쓰레드면 나머지는 대기를 시킨다
		// Runnable
		Toilet toilet = new Toilet(); // 화장실 1칸 (동기화 된 클래스)
		Thread 홍길동 = new Thread(toilet, "홍길동"); // 사람1
		Thread 이순신 = new Thread(toilet, "이순신"); // 사람2

		홍길동.start();
		이순신.start();
	}
}

// 1인용 화장실..... 한명이 쓰고있으면 다른 사람들은 대기해야함.
class Toilet implements Runnable {
	private int time; // 10초동안 사용 (동시 사용은 불가능)

	@Override
	public void run() {
		synchronized (this) {		// 이 클래스는 동기화 시킬거임.
			String name = Thread.currentThread().getName();		// 쓰레드 이름 받기
			System.out.println("화장실들어감");
			for (time = 1; time <= 10; ++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(name+ " " + "화장실사용중..." + time + "초");
			}
			System.out.println(name+ " " + "화장실나옴");
		}	// synchronized(this)
	}		// run()
}			// toilet{}