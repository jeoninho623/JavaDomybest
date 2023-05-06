package multiThreading;

public class sync2 {
	public static void main(String[] args) {
		DressRoom dressroom = new DressRoom();
		Thread 짱구 = new Thread(dressroom, "짱구");
		Thread 철수 = new Thread(dressroom, "철수");
		Thread 훈이 = new Thread(dressroom, "훈이");
		
		짱구.start();
		철수.start();
		훈이.start();
	}
}

// 의상 탈의실
// 의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다
class DressRoom implements Runnable{
	private int time; 	//10초동안 사용 (동시 사용은 불가능)

	@Override
	public void run() {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 의상실 들어감");
			for(time = 1; time<=10; ++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name+ " "+ "의상실사용중..."+ time + "초");
			}
			System.out.println(name+ " " + "의상실나옴");
		}
		
	}
	
}