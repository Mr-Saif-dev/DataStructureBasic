package DP_And_Memoization;

import java.util.Scanner;

/*Longest Increasing Subsequence
Send Feedback
Given an array with N elements, you need to find the length of the longest subsequence in the given array 
such that all elements of the subsequence are sorted in strictly increasing order.
Input Format
The first line of input contains an integer N. The following line contains N space separated integers, that denote the value of elements of array.
Output Format
The first and only line of output contains the length of longest subsequence.
Constraints
1 <= N <= 10^3
Time Limit: 1 second
Sample Input 1 :
6
5 4 11 1 16 8
Sample Output 1 :
3
Sample Output Explanation
Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
Sample Input 2 :
3
1 2 2
Sample Output 2 :
2
Sample Input 3 :
8
2 6 1 9 4 5 3 8
Sample Input 3 :
6

*/
public class LongestIncreasingSubsequence {
	// Time Complexity - O(n^2) Space Complexity - O(n)
	public static int lis(int arr[]) {
           
//		int omax = 0;
		int omax = 1;
		int storage[] = new int[ arr.length ];
		storage[0] = 1;
		for( int i = 1; i < storage.length; i++ ) {
			int max = 0;
			for( int j = 0; j < i; j++ ) {
				if( arr[j] < arr[i] ) {
					if( storage[j] > max ) {
						max = storage[j];
					}
				}
			}
			storage[i] = max + 1;
			if( storage[i] > omax ) {
				omax = storage[i];
			}
		}
        return omax;
        
	}
	
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int a[] = new int[n];
           for( int i = 0; i < n; i++ ) {
        	   a[i] = sc.nextInt();
           }
           
           System.out.println(lis(a));
                      sc.close();
	}

}
