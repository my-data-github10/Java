package com.sunbeam;

class Manager implements Employee {
	 double da,bs;
	 

	public Manager(double da, double bs) {
		super();
		this.da = da;
		this.bs = bs;
	}
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return da + bs;
	}
	@Override
	public double calcIncentives() {
		return 0.2 * bs;
	}
}