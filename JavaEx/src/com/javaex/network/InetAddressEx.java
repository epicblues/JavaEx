package com.javaex.network;
import java.net.*;
public class InetAddressEx {

	public static void main(String[] args) {
		
		// 내 IP 확인
		try {
			InetAddress local = InetAddress.getLocalHost(); // Domain Name Service
			System.out.println("local IP: " + local.getHostAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		printServerIp("www.google.com");
		printServerIp("www.naver.com");
	}
	
	
	private static void printServerIp(String hostName) {
		try {
			InetAddress[] remotes = InetAddress.getAllByName(hostName);
			for(InetAddress address : remotes) {
				System.out.println(hostName + " : " + address.getHostAddress());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
