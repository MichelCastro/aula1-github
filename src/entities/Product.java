package entities;

import java.util.Scanner;

public class Product{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				mat[M][N] = sc.nextInt();
			}
		}
	
		
		
		sc.close();
	} 
}