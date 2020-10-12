package pra1012;

public class star3 {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=6-i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

}
