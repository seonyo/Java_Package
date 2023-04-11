//주사위는 눈의 수(1~6)는 이것이다. 
//10번 던져서 1의 눈이 나오면 500원,
//10번 던져서 2의 눈이 나오면 1000원,
//10번 던져서 3의 눈이 나오면 1500원,
//10번 던져서 4의 눈이 나오면 2000원,
//10번 던져서 5의 눈이 나오면 2500원,
//10번 던져서 6의 눈이 나오면 3000원,
//전체의 금액은 얼마인가

package pack05;

public class RandomEx {
	public static void main(String[] args) {
		int answer=0;
		for(int i=1; i<=10; i++) {
			answer+=((int)Math.random()*6+1)*500;
		}
		System.out.println(answer);
	}
}
