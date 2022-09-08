//Roman numerals are represented by seven different symbols: I, V, X, L, C, D 
//and M. 
//
// 
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// For example, 2 is written as II in Roman numeral, just two one's added 
//together. 12 is written as XII, which is simply X + II. The number 27 is written as 
//XXVII, which is XX + V + II. 
//
// Roman numerals are usually written largest to smallest from left to right. 
//However, the numeral for four is not IIII. Instead, the number four is written as 
//IV. Because the one is before the five we subtract it making four. The same 
//principle applies to the number nine, which is written as IX. There are six 
//instances where subtraction is used: 
//
// 
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900. 
// 
//
// Given a roman numeral, convert it to an integer. 
//
// 
// Example 1: 
//
// 
//Input: s = "III"
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: s = "IV"
//Output: 4
// 
//
// Example 3: 
//
// 
//Input: s = "IX"
//Output: 9
// 
//
// Example 4: 
//
// 
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
// 
//
// Example 5: 
//
// 
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 15 
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M'). 
// It is guaranteed that s is a valid roman numeral in the range [1, 3999]. 
// 
// Related Topics Hash Table Math String 👍 1899 👎 146
    
package leetcode.editor.en;

import java.util.*;

/**
 * @author  Ives.He 
 * @date    2021-10-04 00:25:31 
 */
public class P13_RomanToInteger {
 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        /**
         * 自己硬寫的方式
         */
//        LinkedList<String> rome = new LinkedList<>();
//        LinkedList<Integer> nums = new LinkedList<>();
//        BiConsumer<String,Integer> set = (k, v)-> {
//            rome.add(k);
//            nums.add(v);
//        };
//
//        set.accept("CM",900);
//        set.accept("CD",400);
//        set.accept("XC",90);
//        set.accept("XL",40);
//        set.accept("IX",9);
//        set.accept("IV",4);
//        set.accept("M",1000);
//        set.accept("D",500);
//        set.accept("C",100);
//        set.accept("L",50);
//        set.accept("X",10);
//        set.accept("V",5);
//        set.accept("I",1);
//        List<Integer> result = new ArrayList<>();
//        String tmp = s;
//        for(int i =0; i<rome.size(); i++){
//            String inRome = rome.get(i);
//            while(tmp.contains(inRome)){
//                tmp = tmp.replaceFirst(inRome,"");
//                result.add(nums.get(i));
//            }
//        }
//
//        return result.stream().mapToInt(i->i).sum();
        /**
         * 改善學習的寫法
         */
        Map<Character,Integer> map = new HashMap<>();
            map.put('M',1000);
            map.put('D',500);
            map.put('C',100);
            map.put('L',50);
            map.put('X',10);
            map.put('V',5);
            map.put('I',1);

        int result = 0;
        for(int i =0; i<s.length()-1; i++){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));
            }
        }
        return result + map.get(s.charAt(s.length()-1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}