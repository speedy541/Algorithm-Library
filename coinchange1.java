
import java.util.Scanner;
public class coinchange1 {
    static void find(int[] a,int[] table,int[] coin,int w)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<table.length;j++)
            {
                if(j>=a[i])
                {
                    int k=Math.min(table[j],1+table[j-a[i]]);
                    if(k<table[j])
                    {
                        table[j]=k;
                        coin[j]=i;
                  
                    }
                    
                 }
                }
            }
        System.out.println(table[table.length-1]);
        int sum=w;
        while(sum!=0)
        {
          System.out.print(a[coin[sum]]+" ");
            sum=sum-a[coin[sum]];
       }
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int[] table=new int[w+1];
        int[] coin=new int[w+1];
        for(int i=0;i<=w;i++)
        {
            table[i]=1000000001;
            coin[i]=-1;
        }
        table[0]=0;
        find(a,table,coin,w);
    }
}
