
public class Stopwatch extends Thread {

	public void run() {
		int minute = 0;
		int hour = 0;
		try {

			for (int i = 0; i < 61; i++) {
				System.out.println(hour + "시" + minute + "분" + i + "초");
				Thread.sleep(1000);
				if (i == 59) {
					i = -1;
					minute++;
				}
				if(minute==60) {
					minute = 0;
					hour++;
				}
				if(hour==24) {
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
	}

}
