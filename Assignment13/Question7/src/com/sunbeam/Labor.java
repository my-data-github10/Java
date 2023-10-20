package com.sunbeam;

class Labor implements Employee {
	 double hrs,rate;
	 

	public Labor(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}
	@Override
	public double getSal() {

		return hrs*rate;
	}
	@Override
	public double calcIncentives() {
		if (hrs>300)
			return  0.05*hrs*rate;	
		return 0.0;
	 
}
}