package com.soprasteria;


import java.util.Random;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mazzo = new int[40];
		Random r = new Random();
		//Scanner in = new Scanner(System.in);
		
		
		for(int i = 0; i < 40; i++) {
			while(true) {
				boolean presente = false;
				int numberRandom = r.nextInt(40) + 1;
				for(int y = 0; y < mazzo.length; y++) {
					if(mazzo[y] == numberRandom) {
						presente = true;
						break;
					}
				}
				if(!presente) {
					mazzo[i] = numberRandom;
					break;
				}
			}
		}
		
		for(int i = 0; i < 40; i++) {
			System.out.println(mazzo[i]);
		}

	}

}
