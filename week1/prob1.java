import java.io.*;
import java.util.*;

 class BitManipulation1
{
      int limitsXor(int l1,int l2,int[] a)
     {
        int c=0;
        for(int i=l1;i<=l2;i++)
        {
            c=c^a[i];
        }
        return c;
     }
 int[] arrayXor(int[] a,int[] q)
 {
    
     int[] result=new int[q.length/2];
     int j=0;
     try
     {
     for(int i=0;i<q.length;i+=2)
     {
         result[j]=limitsXor(q[i],q[i+1],a);
         j++;
     }
     }
     catch(Exception e)
     {
         System.out.println("error");
     }
         return result;
     
 }
}
public class prob1{
    public static void main(String[] args)throws IOException
    {
       
        int[][] at={{1,3,4,8},{0,1,3,7,1,1},{1,8,0,1,3,4},{0,0,0,0,0,0,0},{1,1,1,1,1},{100,0,200,45} };
        int[][] qt={{0,1,1,2,0,3,3,3},{1,2,4,5,0,3,2,5,0,3,1,5}, {0,0,0,4,1,4,4,4,4,5},{0,3,0,2,0,5,1,5},{0,3,0,2,0,4,1,2},{0,3,1,3,3,3,2,3,1,2}};
        int[][] output={{2,7,14,8},{2,0,5,4,5,5},{1,11,10,3,7},{0,0,0,0},{0,1,1,0},{129,229,45,229,200}};
          BitManipulation1 bm=new BitManipulation1();
        
        int[][] r1=new int[at.length][];
        for(int i=0;i<at.length;i++)
        {
        r1[i]=bm.arrayXor(at[i],qt[i]);
        }   
        for(int i=0;i<r1.length;i++)
        {
        if(Arrays.equals(output[i],r1[i]))
        System.out.println("passed");
        else
        System.out.println("failed");
        }
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//array length
        int a[]= new int[n];
        int q[]=new int[2*n];
        String s1=br.readLine();
        String[] sa1=s1.split(" ");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sa1[i]);
        }
         String s2=br.readLine();
        String[] sa2=s2.split(" ");
        for(int i=0;i<2*n;i++)
        {
            q[i]=Integer.parseInt(sa2[i]);
        }
      
        BitManipulation1 bm1=new BitManipulation1();
        
        int r[]=bm1.arrayXor(a,q);
        for(int i=0;i<r.length;i++)
        {
            System.out.print(r[i]+" ");
        }   */
    }
    
}
     
