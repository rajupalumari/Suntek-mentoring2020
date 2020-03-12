
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class BitManipulation5
{
    public int[] noOfSetBits(int number) 
    {
       int[]  output= new int[number+1];
        for(int i=1;i<=number;i++)
        {
          output[i]=output[i&(i-1)]+1;
        }
        return output;
    }
    public boolean test(int[] a ,int[] b)  //Testing excpected output and output
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            return false;
        }
        return true;
    }
    public  void Testing_differnt_cases()//Testing Different Cases
    {
         //TestCase1
        int test1=3;
        int[] out1=noOfSetBits(test1);
        int expected_output[] ={0,1,1,2};
        if(test(out1,expected_output))
        System.out.println("Test case1 Passed");
        else
        System.out.println("Test case1 Failed");
           //TestCase2
        int test2=8;
        int[] out2=noOfSetBits(test2);
        int[] expected_output2 = {0,1,1,2,1,2,2,3,1};
            if(test(out2,expected_output2))
            System.out.println("Test case2 Passed");
            else
            System.out.println("Test case2 Failed");
           //TestCase3
        int test3=10;
        int[] out3=noOfSetBits(test3);
        int expected_output3[] ={0,1,1,2,1,2,2,3,1,2,2};
            if(test(out3,expected_output3))
            System.out.println("Test case3 Passed");
            else
            System.out.println("Test case3 Failed");
         //TestCase4
        int test4=15;
       int[] out4=noOfSetBits(test4);
        int expected_output4[] ={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
            if(test(out4,expected_output4))
            System.out.println("Test case4 Passed");
            else
            System.out.println("Test case4 Failed");
           //TestCase5
        int test5=1;
        int[] out5=noOfSetBits(test5);
         int expected_output5[] ={0,1};
             if(test(out5,expected_output5))
            System.out.println("Test case5 Passed");
            else
            System.out.println("Test case5 Failed");
    }
}
public class prob5 {
    public static void main(String a[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int number =Integer.parseInt(br.readLine());
        BitManipulation5 bm = new BitManipulation5();
            int[] output=bm.noOfSetBits(number);
            
            for(int i:output)
             System.out.print(i+" ");
            System.out.println();
          
            bm.Testing_differnt_cases();
    }
}
