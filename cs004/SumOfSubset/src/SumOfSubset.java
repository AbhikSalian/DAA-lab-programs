import java.util.Scanner;
public class SumOfSubset {
	static int flag=1;
	static int[]set,x;
	static int d,n;
	static void sumofsub(int s,int k)
	{
		int i;
		x[k]=1;
		if(s+set[k]==d)
		{
			if(flag==1)
			{
				System.out.println("The subsets with sum= "+d+" are ");
				flag=0;
			}
			System.out.print("{");
			for(i=1;i<=n;i++)
			{
				if(x[i]==1)
					System.out.print(set[i]+",");
			}
			System.out.println("}");
		}
		
		else
		{
			if(s+set[k]<d && k+1<=n)
			{
				sumofsub(s+set[k],k+1);
				x[k+1]=0;
			}
			if(k+1<=n && s+set[k+1]<=d)
			{
				x[k]=0;
				sumofsub(s,k+1);
				x[k+1]=0;
			}
		}
	}
	public static void main(String[] args)
	{
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the set");
		n=sc.nextInt();
		set=new int[n+1];
		x=new int[n+1];
		System.out.println("Enter set elements in increasing order");
		for(i=1;i<=n;i++)
		{
			set[i]=sc.nextInt();
			
		}
		System.out.println("Enter the sum (d):");
		d=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+set[i];
		}
		if(sum<d || set[1]>d)
		{
			System.out.println("No subset possible with sum="+d);
		}
		else if(flag==1)
		{
			System.out.println("No subset possible");
		}
		else
		{
			System.out.println("The subsets with sum="+d+" are ");
			sumofsub(0,1);
			
		}
	}
}