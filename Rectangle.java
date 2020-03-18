package two;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		System.out.println(r.getLength());//周长
		System.out.println(r.getArea());//面积
	}

		// TODO Auto-generated method stub
		private int width;    //宽
		private int high;    //高
		
		public Rectangle() {}    //空参构造
		public Rectangle(int width,int high) {
			this.width=width;   //有参构造
			this.high=high;
		}
		public void setwidth(int width) {   //设置宽
			this.width=width;
		}
		public int getwidth() {      //获取宽
			return width;
		}
		public void setHigh(int high) {   //设置高
			this.high=high;
		}
		public int getHigh() {     //获取高
			return high;
	}
public int getLength() {   //获取周长
	return 2 *(width+high);
}
public int getArea() {   //获取面积
	return width*high;
}
}
