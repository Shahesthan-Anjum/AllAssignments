package com.cg;

import com.cg.Sim;

public class Airtel implements Sim{
	@Override
	public void calling() {
		System.out.println("Calling from Airtel sim");
	}
	@Override
	public void data() {
		System.out.println("Browsing from Airtel Sim data");
	}
}