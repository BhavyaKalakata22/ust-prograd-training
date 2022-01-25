import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int answerQuery(int l, int r,String s) {
        // Return the answer for this query modulo 1000000007.
            int a[]=new int[26];
        for(int i=l-1;i<r;i++)
            a[s.charAt(i)-'a']++;
        Arrays.sort(a);
        boolean odd=false;
        int sum=0;
        for(int i=25;i>=0;i--)
        {
            if(a[i]==0)
                break;
            else if(odd==false&&a[i]%25!=0)
            {
                sum=sum+a[i];
                odd=true;
            }
            else if(a[i]%25==0)
                sum=sum+a[i];
                
        }
        return sum%1000000007;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int result = answerQuery(l, r,s);
            System.out.println(result);
        }
        in.close();
    }
}
