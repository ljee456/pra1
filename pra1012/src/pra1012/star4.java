package pra1012;

public class star4 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//**
		//*
		//3번째 줄 까지는 1개씩 늘어나고
		//4번째 줄 부터는 1개씩 줄어드는 구조
		//하나의 패턴이 아닌 경우에는 동일한 패턴이 적용되는
		//지점까지 분할을 해서 해결
		
		for(int i=1; i<=5; i=i+1) {
			//증가하는 부분
			if(i <= 3) {
				for(int j=1; j<=i; j=j+1) {
					System.out.printf("*");
				}
			}
			//감소하는 부분
			else {
				for(int j=1; j<=6-i; j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}

	}

}
