package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		
		while(true) {
			System.out.println(md.now());
			try {
				Thread.sleep(1000); // 1초동안 프로그램 멈춤
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}
	}
}

class MyDate{
	// 현재 시간 가져오기
	
	public String now() {
		String str = null;
		Calendar cal = Calendar.getInstance();		// 컴퓨터의 시간을 받아옴
		Date date = cal.getTime();			// 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		str = sdf.format(date);
		return str;
	}
}