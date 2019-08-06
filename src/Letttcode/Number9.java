package Letttcode;

public class Number9 {
    //leetcode的第九题
    //题目链接  https://leetcode-cn.com/problems/palindrome-number/
    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    //这道题是用于判断一个int数是否为回文数
    public boolean isPalindrome(int x) {
        //负数肯定不是回文数
        if(x < 0){
            return  false;
        }
        if (x == 0){
            return  true;
        }

        String value = String.valueOf(x);
        int length = value.length();
        if (length == 1)return true;
        int i = 0;
        while (i <= length){
            if (value.charAt(i++) != value.charAt(--length)){
                return false;
            }
        }
        return  true;
    }
}
