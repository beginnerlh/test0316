/*
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。

示例 1:
输入: 3
输出: 0
解释: 3! = 6, 尾数中没有零。

示例 2:
输入: 5
输出: 1
解释: 5! = 120, 尾数中有 1 个零.
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
