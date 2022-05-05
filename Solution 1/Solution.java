import java.util.Scanner;

class Solution{
	
	static void insertionSort(int[] array,int n){
		int i,j,temp;
		
		for(i=n-2;i>=0;i--){
			temp=array[i+1];
			
			for(j=i;j>=0 && array[j]>temp;j--){
				
				array[j+1]=array[j];
			}
			array[j+1]=temp;
		} 
		
	} 
	
	public static void main(String... args){

		Scanner scan= new Scanner(System.in);
			
		int n = scan.nextInt();
			
		int[] array = new int[n];
		
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
		}
		
		insertionSort(array,n);
		
		for(int x:array){
			System.out.print(x+" ");
		}
	}
	
}