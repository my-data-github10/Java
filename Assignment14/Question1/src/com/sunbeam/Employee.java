package com.sunbeam;


public interface Employee {
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Employee []arr) {
		double total=0.0;
		for (Employee e: arr)
			total += e.getSal() +e.calcIncentives();
		return total;
	}
	

}


