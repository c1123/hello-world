/*
 * �����������͵�ֵ���ݣ����ı�ԭֵ����Ϊ���ú�ͻᵯջ���ֲ�������֮��ʧ
 * �����������͵�ֵ���ݣ��ı�ԭֵ����Ϊ��ʹ������ջ�����Ƕ��ڴ���������ڣ�����ͨ����ַ��������
 * Java�е����Ǵ�ֵ���Ǵ�ַ��
 * Java��ֻ�д�ֵ����Ϊ��ֵַҲ��ֵ����ȥ���Զ�˵���֣�֧�����Ǹ�˾�Java֮������
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
