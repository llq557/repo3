package edu.wlxy.ch06;

import edu.wlxy.ch06.UsbInterface;

/**
 * U盘。
 */
public class UDisk implements UsbInterface,Person {
	public void service() {
		System.out.println("连接USB口，开始传输数据。");
	}

	@Override
	public void ss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
