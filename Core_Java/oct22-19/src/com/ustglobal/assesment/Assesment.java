package com.ustglobal.assesment;

public class Assesment {
	public void combinationArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			char c=(char) (96+array[i]);
			System.out.print(c+","+array[i]+",");
		}
	}
	public void mergeArray(int[] array1, int[] array2) {
		int size=array1.length+array2.length;
		int[] mergeArray=new int[size+5];
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			mergeArray[i]=array1[i];
			mergeArray[i+1]=array2[i];
		}
		for(int j=0;j<size;j++) {
			System.out.print(mergeArray[j]+",");
		}
	}
	public void numToArray(int num) {
		int temp=num;
		int i=0,count=0,j=0;
		while(temp!=0) {
			temp=temp/10;
			
			System.out.println(count++);
		}
		int[] num2 = new int[count];
		int[] num3=new int[count];
		while(num!=0) {
			num2[i++]=num%10;
			num=num/10;
			
			System.out.println(num2[i]);
		}
//		for(j=count;j>0;j--) {
//			System.out.println(num2[j]);
//		}
	}

	public void pattern(int n) {
		int size=(n-1)*(n-1);
		for(int i=0;i<n;i++) {
			for (int j = 0; j < size; j++) {
				if(i>=j) {
					if(i%2==0) {
						System.out.print("*");
					}
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<(n-1)) {
					if(i%2!=0) {
						System.out.print("*");
					}
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assesment as=new Assesment();
		int num=1234;
		int[] array1= {1,3,5};
		int[] array2= {2,4,6};
		as.mergeArray(array1, array2);
//		as.combinationArray(array1);
//		as.numToArray(num);
//		as.pattern(5);
	}
}
