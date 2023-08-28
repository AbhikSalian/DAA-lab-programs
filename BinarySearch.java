import java.util.*;
public class BinarySearch 
{
    
   
    public int BSearch(int []a,int low,int high,int key)
    {
        while(low<high)
        {
        int mid=(low+high)/2;
        if(a[mid]==key)
        {
            return mid;
        }
        else if(a[mid]<key)
        {
            return BSearch(a,mid+1,high,key);
        }
        else if(a[mid]>key)
        {
            return BSearch(a,low,mid-1,key);
        }
    }
        return -1;
    }
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        BinarySearch bs=new BinarySearch();
        System.out.println("Enter number of elements : ");
        int n=s.nextInt();
        int []a;
        a=new int[n];
        System.out.println("Enter the elements in ascending order : ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the key element to be searched : ");
        int key=s.nextInt();
        //bs.createList(a);
        int loc;
        loc=bs.BSearch(a,0,n-1,key);
        if(loc>=0)
        {
            System.out.println("Key element is found at index "+loc);
        }
        else{
            System.out.println("Key element not found");
        }
    }
}
