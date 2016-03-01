package nowCoder.algorithm.hash;

/**
 * ��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ���λ�á�
 * ��Ϊ�մ�������-1��λ��������0��ʼ
 * 
 * ��ϣ����
 * 	ͳ��ÿ���ַ������ַ����г��ֵĴ���
 * 	��ÿ���ַ�ӳ���һ������
 * 	��ͷ��βɨ��������Σ���һ�Σ���Ӧ�Ĵ���+1�� �ڶ��Σ�ÿɨ�赽һ���ַ�������O(1)��ʱ����еõ�����
 * 
 * �ַ�����һ������Ϊ8bit���������ͣ�javaΪ16���ܹ���256�ֿ��ܣ��������鳤��Ϊ256
 * �����ڴ��С�� int 4�ֽ� 4 * 256  1KB,��С�ǳ��������Կ��Կ���O(1)
 * @author snow
 *
 */
public class FirstNotRepeatingChar {
	//private static final int _1M = 1024 * 1024;
	public int firstNotRepeatingChar(String str){
		if (str == null){
			return -1;
		}
		//����ĸ��ASCII��Ϊ������±�������ֵΪ���ֵĴ���  Ĭ���ǳ�ʼ��Ϊ0��
		int[] charCount = new int[256];
		int len = str.length();
		for (int i = 0 ; i < len; i++) {
			charCount[(int)str.charAt(i)]++;
		}
		for (int i = 0; i < len; i++) {
			if (charCount[(int)str.charAt(i)] == 1){
				return i;
			}
		}
		return -1;//�п��ܣ�û�г��ִ���Ϊ1��
	}
	
	/**
	 * ����hash����ص����⣺
	 * �٣��ӵ�һ���ַ�����ɾ���ڵڶ����ַ����г��ֹ��������ַ�
	 * 		����������ʵ�ֵļ򵥹�ϣ�����洢�ڶ����ַ���	
	 * 		��ͷ��βɨ���һ���ַ����е��ַ���������O(1)��ʱ���ڣ��жϸ��ַ����Ƿ�����ڵڶ����ַ�����
	 * 		O(n)
	 * �ڣ�ɾ���ַ����������ظ����ֵ��ַ�
	 * 		�ò���������ʵ�ֵļ򵥹�ϣ��
	 * 		������Ԫ�ص����壺�±꿴����ASCII�룬����ֵΪ��Ӧ����ĸ�Ƿ����ַ����г��ֹ�
	 * 		��һ�γ��֣�����Ϊtrue���´μ�⵽ֵΪtrueʱ����ʾ�Ѿ����ֹ���O(1)ʱ���ж�
	 * 		O(n)
	 * �ۣ�������������г��ֵ���ĸ��ͬ������ÿ����ĸ���ֵĴ���Ҳ��ͬ����λ��
	 * 		����һ��������ʵ�ֵļ򵥹�ϣ��
	 * 		��ɨ�赽��һ�������е�ÿ���ַ�ʱ��Ϊ��ϣ���ж�Ӧ�����ֵ+1
	 * 		ɨ��ڶ������ʣ�ûɨ�赽һ���ַ����ͽ���Ӧ����-1
	 * 		ɨ����󣬹�ϣ����Ӧ������ֵΪ0�����Ǳ�λ��
	 * 
	 */
	public static void main(String[] args) {
		System.out.println((int)"as4".charAt(1));
		FirstNotRepeatingChar fc = new FirstNotRepeatingChar();
		System.out.println(fc.firstNotRepeatingChar("21213443"));
	}
}