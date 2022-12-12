package org.perscholas.practicesba;

import java.util.Scanner;

interface ParkingSystem {
	double NIGHTLY = 30; 
	double MORNING = 20; 
	double TWENTY_FOUR = 45;
	
	static double processTicket() {
		return 0;		
	}
	
}

class HospitalParking implements ParkingSystem{
	int time;
	double surcharge= 0.2;
	public HospitalParking(int time) {
		this.time = time;
	}
	
	public double processTicket() {
		
		double price;
		if(time>5 && time<17) {
			price = (MORNING+1)*surcharge;
		}else if(time>17 && time<24) {
			price= (NIGHTLY+1)*surcharge;
		}else {
			price=(TWENTY_FOUR+1)*surcharge;
		}
		return price;
		
	}
	
}
class MallParking implements ParkingSystem{
	int time;
	double surcharge=0.1;
	
	public MallParking(int time) {
		this.time = time;
	}
	
	public double processTicket() {
		
		double price;
		if(time>5 && time<17) {
			price = (MORNING+1)*surcharge;
		}else if(time>17 && time<24) {
			price= (NIGHTLY+1)*surcharge;
		}else {
			price=(TWENTY_FOUR+1)*surcharge;
		}
		return price;
		
	}
}

public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a time: ");
		int time = scn.nextInt();
		MallParking mallParking=new MallParking(time);
		System.out.println("Price for mall parking is $"+ mallParking.processTicket());
		
		HospitalParking hospitalParking=new HospitalParking(time);
		System.out.println("Price for hospital parking is $"+ hospitalParking.processTicket());
		
		scn.close();
	}

}
