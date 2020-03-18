/*
 * static的注意事项
 * a:在静态方法中是没有this关键字的
 *   *静态是随着类的加载而加载，this是随着对象的创建而存在
 *   *静态比对象先存在
 * b:静态方法只能访问静态的成员变量和静态的成员方法
 *   静态方法
 *    *成员变量：只能访问静态变量
 *    *成员方法：只能访问静态成员方法
 *   非静态方法
 *    *成员变量：可以是静态的也可以是非静态的
 *    *成员方法：可以是静态的成员方法，也可以是非静态的成员方法
 *   简单记
 *    *静态只能访问静态
 * 静态变量和成员变量的区别
 *  A:所属不同
 *    *静态变量属于类，所以也称为对象变量
 *    *成员变量属于对象，所以也称为实例变量（对象变量）
 *  B:内存中位置不同
 *    *静态变量存储于方法区的静态区
 *    *成员变量存储于堆内存
 *  c:内存出现时间不同
 *    *静态变量随着类的加载而加载，随着类的消失而消失
 *    *成员变量随着对象的创建而存在，随着对象的消失而消失
 *  D:调用不同
 *    *静态变量可以通过类名调用，也可以通过对象调用
 *    *成员变量只能通过对象名调用
 */
package two;
//如果一个类中所有的方法都是静态的，需要再多做一步，私有构造方法，目的是不让其他类创建本类对象
//直接类名.调用即可
public class Person01 {
	private Person01(){}
	//获取最大值
	public static int getMax(int[] arr) {
		int max=arr[0];   //记录第一个元素
		for (int i=1;i<arr.length;i++) {  //从第二个元素开始遍历
			if (max<arr[i]) {  //max与数组中其他的元素比较
				max=arr[i];   //记录最大值
			}
		}
		return max;  //将最大值返回
	}
	//数组 遍历
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {  //遍历数组
			System.out.print(arr[i]+"");
		}
	}
	//数组反转
    public static void revArray(int[] arr) {
    	for (int i=0;i<arr.length/2;i++) {  //循环次数是元素个数的一半
    		/*
    		 * arr[0]与arr[arr.length-1-0] 交换
    		 * arr[1]与arr[arr.length-1-1] 交换
    		 * arr[2]与arr[arr.length-1-2] 交换
    		 */
    		int temp=arr[i];
    		arr[i]=arr[arr.length-1-i];
    		arr[arr.length-1-i]=temp;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * public:被JVM调用，所以权限要足够大
     * static:被JVM调用，不需要创建对象，直接类名，调用即可
     * void  ：被JVM调用，不需要有任何返回值
     * main  :只有这样写才能被JVM识别，main不是关键字
     * string[] args:以前是用来接收键盘录入的
    */
		int[] arr = {33,11,22,66,55,44};
		/*Person01 at=new Person01();
		int max = at.getMax(arr);  //获取最值
		System.out.println(max);
		System.out.println("--------");
		at.print(arr);        //打印
		System.out.println();
		System.out.println("--------");
		System.out.println("反转后：");
		at.revArray(arr);    //反转
		at.print(arr);*/
		Person01.print(arr);
	}
}
