package training;

public class Dimensional {
	public static void main(String args[]){  
		int a[]=new int[5];//declaration and instantiation  
		a[0]=62;//initialization  
		a[1]=65;  
		a[2]=57;  
		a[3]=28;  
		a[4]=33;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  


		//declaring and initializing 2D array  
		int arr[][]={{5,2,1},{3,6,9},{8,1,7}};  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  

		}
		}
}

