package Lab21;
import java.util.Scanner;


public class QuickSort {
	
	static void QuickSort(String arr[],int low,int high) {
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		String pivot=arr[mid];
		while(i<=j) {
			while(arr[i].compareTo(pivot)<0) {
				i++;
			}
			while (arr[j].compareTo(pivot)>0) {
				j--;
			}
			if(i<=j) {  
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
				
			}
			
		}
		if(low<j) {
			QuickSort(arr,low,j);
		}
		if(high>i) {
			QuickSort(arr,i,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int str=sc.nextInt();
		String arr[]=new String[str+1];
		System.out.println("Enter the unsorted array: ");
		for(int i=0;i<=str;i++) {
			arr[i]=sc.nextLine();
			
		}
		
		System.out.println("Before QuickSort: ");
		for(int i=0;i<=str;i++) {
			System.out.println(arr[i]+" ");
		}
		QuickSort(arr,0,str);
		
		System.out.println("After QuickSort: ");
		for(int i=0;i<=str;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		

	}

}
