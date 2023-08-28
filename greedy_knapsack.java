import java.util.Scanner;
public class greedy_knapsack 
{
    static int []p,wt;
    static int C,n;
    static void knapsack()
    {
        int i;
        int c=C;
        int profit=0;
        for(i=1;i<=n;i++)
        {
            if(c>=wt[i])
            {
                System.out.println("Item"+i+"\tWeight: "+wt[i]+"\tProfit: "+p[i]+"\t is added to knapsack");
                profit=profit+p[i];
                c=c-wt[i];
            }
            
        }
        System.out.println("Total profit of the item is "+profit);
        
    }
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no. of items : ");
            n=sc.nextInt();
            System.out.println("Enter the profits : ");
            p=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                p[i]=sc.nextInt();
            }
            System.out.println("Enter the weights : ");
            wt=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                wt[i]=sc.nextInt();
            }
            System.out.println("Enter the maximum capacity : ");
            C=sc.nextInt();
            System.out.println("Knapsack using greedy method : ");
            knapsack();
        }
}
