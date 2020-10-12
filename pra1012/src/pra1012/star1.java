package pra1012;

public class star1 {

	public static void main(String[] args) {
		/*
		 1***** 1-5
		 2***** 1-5
		 3***** 1-5
		 4***** 1-5
		 5***** 1-5
		 별5개를 출력하고 줄 바꿈 하는 것을 5번 수행
		 가로 방향이 안쪽 반복문이 되고
		 세로 방향이 바깥쪽 반복문이 된다
		 */
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=5; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

}
