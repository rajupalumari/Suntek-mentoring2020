import java.util.*;
import java.io.*;
class BitManipulation2
{
public int minFlips(int a,int b,int c){
 int counter=0;
        // Finding max of  and b and c. So that we can have a base contion when we are rightShifting
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        while(max!=0)
        {
            //Finding the last element and then 
            int temp3=c&1;
            int temp1=a&1;
            int temp2=b&1;
            if(temp3==0)
            {
                if(temp1==0 && temp2==0)
                {

                }
                else if(temp1==1 && temp2==1)
                {
                    counter++;
                    counter++;
                }
                else
                {
                    counter++;
                }
            }
            else
            {
               if(temp1==0 && temp2==0)
                {
                    counter++;
                }
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
            max=max>>1;

        }
        return counter;
}
public void Testing()
{
        //TestCase 1
        int testA1=2;
        int testB1=6;
        int testC1=5;
        int test1ans=this.minFlips(testA1,testB1,testC1);
        int exp1=3;
        if(exp1==test1ans)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //test case2
        int testA2=2;
        int testB2=6;
        int testC2=3;
        int test2ans=this.minFlips(testA2,testB2,testC2);
        int exp2=2;
        if(exp2==test2ans)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // Test Case 3
        int testA3=0;
        int testB3=7;
        int testC3=5;
        int test3ans=this.minFlips(testA3,testB3,testC3);
        int exp3=1;
        if(exp3==test3ans)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // Test Case 4
       int testA4=14;
        int testB4=15;
        int testC4=0;
        int test4ans=this.minFlips(testA4,testB4,testC4);
        int exp4=7;
        if(exp4==test4ans)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // Test Case 5
        int testA5=10;
        int testB5=8;
        int testC5=13;                
        int test5ans=this.minFlips(testA5,testB5,testC5);
       // System.out.print(test5ans);
        int exp5=3;
        if(exp5==test5ans)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        }
}
public class prob2 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        BitManipulation2 bm= new BitManipulation2();
        int ans=bm.minFlips(a,b,c);
        System.out.println(ans);
        bm.Testing();
    }
}
