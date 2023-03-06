package examprep;
import java.util.Scanner;


public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("First matrix- rows: ");
		int r1=sc.nextInt();
		System.out.println("First matrix- column: ");
		int c1=sc.nextInt();
		
		int arr1[][]=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.println("Enter the array ["+i+"]["+j+"]elements");
				arr1[i][j]=sc.nextInt();
				
						}
		}
		
		
		 System.out.println("The first matrix is: ");
		 for(int i=0;i<r1;i++) {
			 for(int j=0;j<c1;j++) {
				 System.out.print(arr1[i][j]+"\t");
				 
			 }
			 System.out.println();
		 }
		 
		 
		 
		System.out.println("Second matrix- rows: ");
		int r2=sc.nextInt();
		System.out.println("Second matrix- column: ");
		int c2=sc.nextInt();
		
		int arr2[][]=new int[r2][c2];
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.println("Enter the array ["+i+"]["+j+"] elements");
				int x=sc.nextInt();
				arr2[i][j]=x;
			}
		}
		
		
		 System.out.println("The second matrix is: ");
		 for(int i=0;i<r2;i++) {
			 for(int j=0;j<c2;j++) {
				 System.out.print(arr2[i][j]+"\t");
			 }
			 System.out.println();
		 }
		
		
		 int arr3[][]=new int[r1][c2];
		 if(r1==c2 && r2 ==c1)
		 {
			 for(int i=0;i<r1;i++)
			 {
				 for(int j=0;j<c2;j++) {
					  arr3[i][j]=0;
					  for(int k=0;k<r1;k++) {
						  arr3[i][j]=(arr1[i][k]*arr2[k][j]);
						  
					  }
				 }
			 }
			 
			 System.out.println("The new matrix after multiplicaton: ");
			 {
				 for(int i=0;i<r1;i++) {
					 for(int j = 0;j<c2;j++) {
						 System.out.print("\t"+arr3[i][j]+"\t");
						 
					 }
					 System.out.println();
				 }
			 }
		 }
		 
		 
		 else {
			 System.out.println("invalid matrix");
		 }
		  
		
		     
		
		
		

	}

}
