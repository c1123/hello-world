package two;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		System.out.println(r.getLength());//�ܳ�
		System.out.println(r.getArea());//���
	}

		// TODO Auto-generated method stub
		private int width;    //��
		private int high;    //��
		
		public Rectangle() {}    //�ղι���
		public Rectangle(int width,int high) {
			this.width=width;   //�вι���
			this.high=high;
		}
		public void setwidth(int width) {   //���ÿ�
			this.width=width;
		}
		public int getwidth() {      //��ȡ��
			return width;
		}
		public void setHigh(int high) {   //���ø�
			this.high=high;
		}
		public int getHigh() {     //��ȡ��
			return high;
	}
public int getLength() {   //��ȡ�ܳ�
	return 2 *(width+high);
}
public int getArea() {   //��ȡ���
	return width*high;
}
}
