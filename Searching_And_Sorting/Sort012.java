package Searching_And_Sorting;

import java.util.Scanner;
/*Sort 0 1 2
Send Feedback
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2
*/
public class Sort012 {

	   public static void sort012(int arr[]) {
		  // int n = arr.length;
		   //Approach : 1
//		   int h = arr.length-1;
//		   int l = 0;
//		   int m = 0;
//		   while( m <= h)
//		   {
//			   if(arr[m] == 0)
//			   {
//				   swap(arr, l, m);
//				   m++;
//				   l++;
//			   }
//			   if(arr[m] == 1)
//			   {
//				   m++;
//			   }
//			   if(m<h && arr[m] == 2)
//			   {
//				   swap(arr, m, h);
//				   h--;
//				   
//			   }
//			   
//		   }
		   //Approach : 2
		   int mid = 0, low = 0, high = arr.length - 1;
		   while(mid < high)
		   {
			   switch(arr[mid]) 
			   {
			   case 0:
		           swap(arr, mid, low);
		           low++;
		           mid++;
	               break;
			   case 1: 
			       mid++;
			       break;
			   case 2:        
			       swap(arr, mid, high);
				   high--;
			       break;
			  }
		   }
		   
	 }
	 public static void swap(int arr[], int i, int j)
	    {
	    	int temp = arr[i];
	    	arr[i] = arr[j];
	    	arr[j] = temp;
	    }
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			while(t != 0)
			{
			    int n = s.nextInt();
			    int a[] = new int[n];
			    for(int i = 0; i < n; i++)
			    {
			        a[i] = s.nextInt();
			    }
			    sort012(a);
			    for(int k = 0; k < n; k++)
			    {
			        System.out.print(a[k]+" ");
			    }
			    t--;
			}
			s.close();
	}

}
