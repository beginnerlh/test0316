/*
 * ����һ������ n������ n! ���β�������������

ʾ�� 1:
����: 3
���: 0
����: 3! = 6, β����û���㡣

ʾ�� 2:
����: 5
���: 1
����: 5! = 120, β������ 1 ����.
*/
package lianxi0316;

public class test0316 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int n = 53;
		int a = S.trailingZeroes(n);
		System.out.println(a);
	}
}

class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        while(n != 0){
            count += n/5;
            n /= 5;
        }
        return count;
    }
}
