package String;
/* Compress the String
Send Feedback
Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
*/
public class CompressTheString {

	public static String compress(String inputString) {
//		int noOfChars = 256;
//		int a[] = new int[noOfChars];
//		String s = "";
//		char c = 0;
//		inputString += " ";
//		int b = 0;
//		for(int i = 0; i < inputString.length() - 1; i++)
//		{
//			int ch = (int) inputString.charAt(i);
//			
//			 c = (char) ch;
//			 // System.out.print(c+" ");
//			
//			 
//			  b = ++a[ch];
//			 			  
//		}
//		int count = 0;
//		for(int i = 0; i < inputString.length() - 1; i++)
//		{
//			
//		    int ch = (int) inputString.charAt(i);
//		    System.out.print((char)ch);	
//		    if(inputString.charAt(i) == inputString.charAt(i + 1) ) {
//		    for(int j = 0; j < a.length; j++)
//			{
//				
//				if(a[ch] > 1 )
//				{
//					System.out.print(a[ch]);
//				    break;	
//				} 
//				
//			 }
//		
//		    
//			}
//		}
//
//		return s;
		
		
		inputString += " ";
		String s = "";
		for(int i = 0; i < inputString.length(); i++)
		{
			int count = 1;
			while( i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1) )
			{
				count++;
				i++;
			}
			
			if(count == 1)
			{
				s += inputString.charAt(i);
			} else {
				s += inputString.charAt(i) + "" + count;
			}
		}

       return s;
	}
	public static void main(String[] args) {
        String s = "aaannndn";
        String ans = compress(s);
        System.out.println(ans);
	}

}
