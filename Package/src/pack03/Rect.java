package pack03;

public class Rect {
	private int width;
	private int height;
	
	public Rect (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals (Object obj) {  //  Object obj = b와 같다
		Rect p = (Rect) obj;  // p는 b객체를 저장
		if(this.width*this.height == p.width*(p.height))  
				//a.equals(b)를 호출할때 this.width, this.height는 a객체의 멤버
			    //b.equals(c)를 호출할때 this.width, this.height는 b의 객체 멤버
				return true;
		else
			return false;
	}
}
