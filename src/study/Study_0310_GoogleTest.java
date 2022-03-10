package study;

public class Study_0310_GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야한다.
		 * ex)8808은 3,8888은 4로 카운팅 해야함
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
	
