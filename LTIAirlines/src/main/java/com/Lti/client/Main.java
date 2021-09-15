package com.Lti.client;

import com.Lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		Flight f= new Flight(1001,"mumbai","Pune");
		System.out.println(f.getFlightId()+" "+ f.getSource()+ " " + f.getDestination());

	}
	
	public static int add(int n1,int n2) {
		return n1+n2;
		
	}
	
	public static boolean compare(int n1, int n2) {
		if(n1==n2) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
