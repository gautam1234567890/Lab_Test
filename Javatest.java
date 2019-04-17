package com.rt;
import java.util.Scanner;


public class Javatest {
			public static void main(String args[])
		    {
			
			int n = 4;
			
			int[][] pattern = new int[n][n];
			int value = 1;
			int maxCol = n-1;
			int minCol = 0;
			int minRow = 0;
			int maxRow = n-1;
	 while (value <= n*n)
			{
			for (int i = minCol; i <= maxCol; i++)
			{
			pattern[minRow][i] = value;
			value++;
			}
				for (int i = minRow+1; i <= maxRow; i++)
				{
					pattern[i][maxCol] = value;
					value++;
				}
				for (int i = maxCol-1; i >= minCol; i--)
				{
				 pattern[maxRow][i] = value;
					value++;
					}
			for (int i = maxRow-1; i >= minRow+1; i--)
				{
					pattern[i][minCol] = value;
					value++;
					}
		minCol++;
		minRow++;
		 maxCol--;
		maxRow--;
				}
		for (int i = 0; i <pattern.length; i++)
			{
				for (int j = 0; j < pattern.length; j++)
		{
		System.out.print(pattern[i][j]+ "\t");
	 }
		System.out.println();
			}
		    }
		
	}


