package com.sort;

public class BubbleSort {
	//the way of BubbleSort
	public static int[] bubbleSort(int[] number) {
		for(int i=0;i<number.length-1;i++) {
			for(int j=0;j<number.length-i-1;j++) {
				if(number[j+1]<number[j]) {
					int temp=0;
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		return number;
	}
	//run on console
	public static void main(String[] args) {
		int num[]= {20,12,31,12,11,2,76};
		num=BubbleSort.bubbleSort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
