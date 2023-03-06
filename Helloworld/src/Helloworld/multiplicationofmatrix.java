package Helloworld;

import java.util.Scanner;

public class multiplicationofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows for the first matrix:");
		int r1=sc.nextInt();
		System.out.print("Enter the number of coloumns for the first matrix:");
		int c1=sc.nextInt();
		int arr1[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print("Enter the array 1's ["+i+"]["+j+"] element:");
				int x=sc.nextInt();
				arr1[i][j]=x;
				
			}
		}
		System.out.print("Enter the number of rows for the second matrix:");
		int r2=sc.nextInt();
		System.out.print("Enter the number of coloumns for the second matrix:");
		int c2=sc.nextInt();
		int arr2[][]=new int[r1][c1];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print("Enter the array 2's ["+i+"]["+j+"] element:");
				int x=sc.nextInt();
				arr2[i][j]=x;
				
			}
		}
		int arr3[][]=new int[r1][c2];
		if(r1==c2&&r2==c1)
		{
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					arr3[i][j]=0;
					for(int k=0;k<r1;k++)
					{
						arr3[i][j]+=(arr1[i][k]*arr2[k][j]);
					}
					
				}
			}
			System.out.println("The new Matrix after multiplication:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(arr3[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Invalid Matrices");
		}
		

}


