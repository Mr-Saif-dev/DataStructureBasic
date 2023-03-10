package Linked_Lists_Assignment;

import java.util.Scanner;



/*     Even after Odd LinkedList

For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers.

The relative order of the odd and even terms should remain unchanged.

Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space. 
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format:
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 
Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40   
Input - 37 43 19 9 -1
Output - 37 43 19 9   */
public class EvenAfterOddLL {
	
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        
		if( head == null || head.next == null) {
			
			return head;
		}
		
		LinkedListNode<Integer> oddH = null, oddT = null, evenT = null, evenH = null;
		
		while(head != null ) {
			
    	    if( head.data % 2 != 0 ) {
				
				if ( oddH == null ) {
					
					oddH = head;
					oddT = head;
			
				} else {
				
					oddT.next = head;
					oddT = head;
			
				}
				
			} else  {
				
				if ( evenH == null ) {
					
					evenH = head;
					evenT = head;
					
				} else {
					
					evenT.next = head;
					evenT = head;
				}
				
			}
			head = head.next;
		}
//		if(oddT != null ) {
//		   
//			oddT.next = null;
//		}
//		if(evenT != null ) {
//		    
//			evenT.next = null;
//		}
//		if(evenH != null && oddT != null ) {
//		  
//			oddT.next = evenH;
//		} 
//		if(oddH == null ) {
//			
//	        oddH = evenH;
//		}
		  
		if(oddH == null ) {
			return evenH;
		}else {
			oddT.next = evenH;
		}
		
		if(evenH != null ) {
			evenT.next = null;
		}
		
		return oddH;
	}
	
   
	public static void print(LinkedListNode<Integer> head) {
    	
    	while (head != null) {
    		
    		System.out.print(head.data + " ");
    		
    		head = head.next;
    	}
    }
	
    public static LinkedListNode<Integer> takeInput(){ 
    	
    	Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
	    LinkedListNode<Integer> head = null, tail = null;
		
		while( data != -1 ) {
		 
		   LinkedListNode < Integer > newNode = new LinkedListNode <> ( data  );
		
		   if(head == null) {
			
			   head = newNode;
			   
			   tail = newNode;
		   
		   } else {
			
			   tail.next = newNode;
			   
			   tail = newNode;
		   
		   }
		   
		   data = s.nextInt();
		}
		s.close();
		
		return head;
	}
	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = takeInput();
		
		head = evenAfterOdd(head);
		
		print(head);
		
		
		
	}

}
