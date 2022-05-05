//Sorting
import java.util.Scanner;
class InsertionSorting{
 
void insertionSorting(int a[]){
int x = a.length;
for(int i=1;i<x;i++){
int temp  = a[i];
int j= i-1;

while(j>=0 && a[j]>temp){
a[j+1] = a[j];
j  =j-1;
}
a[j+1] = temp; 

}

}
void display(int u[]){
for(int w =0;w<u.length;w++){
		System.out.print(u[w]+" ");
	}	
}



public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a1[] = new int[n];
for(int i=0;i<n;i++){
 a1[i] = sc.nextInt();
}

InsertionSorting is = new InsertionSorting();
is.insertionSorting(a1);
System.out.println();
is.display(a1);
}
}