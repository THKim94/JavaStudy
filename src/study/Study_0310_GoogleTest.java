package study;

public class Study_0310_GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
		 * 8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ��Ѵ�.
		 * ex)8808�� 3,8888�� 4�� ī���� �ؾ���
		 */
		int cnt = 0;
        StringBuilder s = new StringBuilder();

        for(int i = 1; i <= 100; i++){
            s.append(i);
        }
        System.out.println(s);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '8')
                cnt++;
        }
        //System.out.println(cnt);
	}
}
	
