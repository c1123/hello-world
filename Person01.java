/*
 * static��ע������
 * a:�ھ�̬��������û��this�ؼ��ֵ�
 *   *��̬��������ļ��ض����أ�this�����Ŷ���Ĵ���������
 *   *��̬�ȶ����ȴ���
 * b:��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
 *   ��̬����
 *    *��Ա������ֻ�ܷ��ʾ�̬����
 *    *��Ա������ֻ�ܷ��ʾ�̬��Ա����
 *   �Ǿ�̬����
 *    *��Ա�����������Ǿ�̬��Ҳ�����ǷǾ�̬��
 *    *��Ա�����������Ǿ�̬�ĳ�Ա������Ҳ�����ǷǾ�̬�ĳ�Ա����
 *   �򵥼�
 *    *��ֻ̬�ܷ��ʾ�̬
 * ��̬�����ͳ�Ա����������
 *  A:������ͬ
 *    *��̬���������࣬����Ҳ��Ϊ�������
 *    *��Ա�������ڶ�������Ҳ��Ϊʵ�����������������
 *  B:�ڴ���λ�ò�ͬ
 *    *��̬�����洢�ڷ������ľ�̬��
 *    *��Ա�����洢�ڶ��ڴ�
 *  c:�ڴ����ʱ�䲻ͬ
 *    *��̬����������ļ��ض����أ����������ʧ����ʧ
 *    *��Ա�������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
 *  D:���ò�ͬ
 *    *��̬��������ͨ���������ã�Ҳ����ͨ���������
 *    *��Ա����ֻ��ͨ������������
 */
package two;
//���һ���������еķ������Ǿ�̬�ģ���Ҫ�ٶ���һ����˽�й��췽����Ŀ���ǲ��������ഴ���������
//ֱ������.���ü���
public class Person01 {
	private Person01(){}
	//��ȡ���ֵ
	public static int getMax(int[] arr) {
		int max=arr[0];   //��¼��һ��Ԫ��
		for (int i=1;i<arr.length;i++) {  //�ӵڶ���Ԫ�ؿ�ʼ����
			if (max<arr[i]) {  //max��������������Ԫ�رȽ�
				max=arr[i];   //��¼���ֵ
			}
		}
		return max;  //�����ֵ����
	}
	//���� ����
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {  //��������
			System.out.print(arr[i]+"");
		}
	}
	//���鷴ת
    public static void revArray(int[] arr) {
    	for (int i=0;i<arr.length/2;i++) {  //ѭ��������Ԫ�ظ�����һ��
    		/*
    		 * arr[0]��arr[arr.length-1-0] ����
    		 * arr[1]��arr[arr.length-1-1] ����
    		 * arr[2]��arr[arr.length-1-2] ����
    		 */
    		int temp=arr[i];
    		arr[i]=arr[arr.length-1-i];
    		arr[arr.length-1-i]=temp;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * public:��JVM���ã�����Ȩ��Ҫ�㹻��
     * static:��JVM���ã�����Ҫ��������ֱ�����������ü���
     * void  ����JVM���ã�����Ҫ���κη���ֵ
     * main  :ֻ������д���ܱ�JVMʶ��main���ǹؼ���
     * string[] args:��ǰ���������ռ���¼���
    */
		int[] arr = {33,11,22,66,55,44};
		/*Person01 at=new Person01();
		int max = at.getMax(arr);  //��ȡ��ֵ
		System.out.println(max);
		System.out.println("--------");
		at.print(arr);        //��ӡ
		System.out.println();
		System.out.println("--------");
		System.out.println("��ת��");
		at.revArray(arr);    //��ת
		at.print(arr);*/
		Person01.print(arr);
	}
}
