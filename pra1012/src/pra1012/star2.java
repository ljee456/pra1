package pra1012;

public class star2 {

	public static void main(String[] args) {
		//1*	1-1
		//2**	1-2
		//3***	1-3
		//4****	1-4
		//5*****1-5
		
		//변하는 숫자의 증감자를 구해서 바깥쪽 반복문의 변수에 곱한 후 더하기 빼기를 이용해서
		//결과를 맞추는 작업 수행 1씩 증가하므로 1*1
		
		for(int i=1; i<=5; i=i+1) {
			for(int j=1; j<=i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
