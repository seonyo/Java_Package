package pack01;

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); //클래스 이름 출력
		System.out.println(obj.hashCode()); // 해시코드는 클래스의 코드값
		System.out.println(obj.toString()); //obj객체를 문자열로 출력
		System.out.println(obj); //obj객체를 문자열로 출력
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
