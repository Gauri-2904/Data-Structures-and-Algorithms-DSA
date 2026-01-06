package hello;

import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
	public int lengthOfLongestSubString(String s) {
		int maxLength=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				final Set<Character>allChar=new HashSet<>();
				for(int loop=i;loop<=j;loop++) {
					allChar.add(s.charAt(loop));
				}
				final int currentLength=j-i+1;
				if(allChar.size()==currentLength) {
					maxLength=Math.max(maxLength,currentLength);
				}
			}
		} 
		return maxLength;
	}
					
				
		
		

	public static void main(String[] args) {
		

	}

}
