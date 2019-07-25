/**
 * 
 */
package com.datastructure.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pramit
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[n];
		while(T --> 0) {
			for(int i=0; i<n; i++) {
				array[i] = sc.nextInt();
			}
		}
		List<Integer> rankList = new ArrayList<Integer>();
		for(int i=n-1; i>=0; i--) {
			int currentTower = array[i];
			int currentTowerRank = 0;
			for(int j=i; j>=0; j--) {
				if(array[j] <= currentTower) {
					currentTowerRank++;
					if(i==0) {
						rankList.add(currentTowerRank);
					}
				}else {
					rankList.add(currentTowerRank);
					break;
				}
			}
		}
		for(int i=rankList.size()-1; i>=0; i--) {
			if(i>0)
				System.out.print(rankList.get(i)+" ");
			else
				System.out.print(rankList.get(i));
		}
	}

}
