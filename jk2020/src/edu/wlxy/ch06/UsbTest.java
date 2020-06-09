package edu.wlxy.ch06;



/**
 * ≤‚ ‘¿‡°£
 * @param args
 */
public class UsbTest {	
	public static void main(String[] args) {
		
		//1°¢U≈Ã
		UsbInterface uDisk = new UDisk();
		uDisk.service();
		
		//2°¢USB∑Á…»
		UsbInterface usbFan= new UsbFan();
		usbFan.service();
	}
}
