/*
 * 基本数据类型的值传递，不改变原值，因为调用后就会弹栈，局部变量随之消失
 * 引用数据类型的值传递，改变原值，因为即使方法弹栈，但是堆内存数组对象还在，可以通过地址继续访问
 * Java中到底是传值还是传址？
 * Java中只有传值，因为地址值也是值（出去面试都说这种，支持者是高司令（Java之父））
 */
package two;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
int a=10;
int b=20;
System.out.println("a:"+a",b:"+b);
change(a,b);
System.out.println("a:"+a",b:"+b);
*/
int[] arr= {1,2,3,4,5};
change(arr);
System.out.println(arr[1]);
	}
public static void change (int a,int b) {
	System.out.println("a:"+a+",b:"+b);
	    a=b;
	    b=a+b;
		System.out.println("a:"+a+",b:"+b);
	}
public static void change (int[] arr) {
	for(int x=0;x<arr.length;x++){
		if(arr[x]%2==0) {
			arr[x]*=2;
		}
	}
}
}
