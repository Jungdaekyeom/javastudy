package TV;

import java.util.Scanner;

public class TV {
	
	Scanner scanner = new Scanner(System.in);

	private int channel; // 1~255
	private int volume; // 0~100
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
		
	}

	public void power(boolean b) {
		power = b;

		// TODO Auto-generated method stub
		
	}

	public void volume(int i) {
		if(i>100 || i<0) {
			System.out.println("볼륨 범위를 벗어났습니다.!");
		} else {
			volume = i;
		}
	}
	
	public void volume(boolean b) {
		if(volume>100 || volume<0) {
			System.out.println("볼륨 범위를 벗어났습니다.");
		} else {
			if(b==true) {
				volume++;
			} else {
				volume--;
			}
		}
		
		// TODO Auto-generated method stub
		
	}
	
	public void channel(int c) {
		if(c>255 || c<0) {
			System.out.println("채널 범위를 벗어났습니다.");
		} else {
			channel = c;
		}
		
	}
	
	public void channel(boolean b) {
		if(channel>255 || channel<0) {
			System.out.println("채널 범위를 벗어났습니다.");
		} else {
			if(b==true) {
				channel++;
			} else {
				channel--;
			}
		}
		
		
	}

	

}
