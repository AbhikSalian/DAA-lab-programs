import java.util.Random;
import java.util.Scanner;
public class QuickSort
{
private int[]a;
void input()
{
Scanner sc=new Scanner(System.in);
Random rm=new Random();
System.out.print("Enter the total numbers:");
int n=sc.nextInt();
a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=rm.nextInt(1000);

}
}
void display()
{
for(int x:a)
{
System.out.println(x+"");
}
}
void sort()
{
quicksort(0,a.length-1);
}
void swap(int left,int right)
{
int temp=0;
temp=a[left];
a[left]=a[right];
a[right]=temp;
  }
void quicksort(int left,int right)
{
if(left<right)
{
int s=partition(left,right);
quicksort(left,s-1);
quicksort(s+1,right);
}
}

int partition(int left,int right)
{
int pivot=a[left];
int i=left;
int j=right+1;
do
{
do{++i;}
while(i<right&&a[i]<pivot);
do {--j;}
while(a[j]>pivot);

swap(i,j);
}while(i<j);
swap(i,j);
swap(left,j);
return j;
}

public static void main(String args[])
{
QuickSort sorter=new QuickSort();
sorter.input();
System.out.println("Array before sorting");
sorter.display();
long startTime=System.nanoTime();
sorter.sort();
long endTime=System.nanoTime();
double duration=(endTime-startTime)/1000000;
System.out.println("\nArray After sorting");
sorter.display();
System.out.println("\nTime for sorting is"+duration+"milli seconds");

}
}