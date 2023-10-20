package com.sunbeam;

class  Clerk implements Employee {

	double sal;
	

	public Clerk(double sal) {
		super();
		this.sal = sal;
	}


	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return sal;
	}

}