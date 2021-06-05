package arrays;

public class BubbleSort {
	
	public static void main (String[]args) {
		
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		
		for(int i = 0; i<n-1; i++) {
			
			boolean sorted = true;
			
			
			for(int j=0; j<n-1-i; j++) { //(why n-1-i)we dont have run loop n-1 every time because, during 1st iteration largest number will come at end at,and during 2nd iteration 2 largest number will be at end ,..and so on so we are subracting it
				
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;//if swapping not sorted
					
					sorted = false ;
				}
			}
			if(sorted)break;
		}
		for(int item: a) {
			System.out.print(item+ " ");
		}
	}

}
