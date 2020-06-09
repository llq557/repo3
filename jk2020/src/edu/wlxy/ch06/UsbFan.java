package edu.wlxy.ch06;

/**
 * USB风扇。
 */
public class UsbFan implements UsbInterface {
	public void service() {
		System.out.println("连接USB口，获得电流，风扇开始转动。");
	}

	@Override
	public void ss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tt() {
		// TODO Auto-generated method stub
		
	}
}
