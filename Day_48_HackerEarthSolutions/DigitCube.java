import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DigitCube {
public static long nextSum(long n) {
 long sum = 0;
  while (n > 0) {
  sum = sum + n % 10;
  n = n / 10;
  }
 return sum;
 
}
public static void main(String args[]) throws IOException {
 
 try {
 
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringBuilder sb = new StringBuilder();
  int test = Integer.parseInt(br.readLine());
 while (test-- > 0) {
    long result = 0;
 
   String[] l = br.readLine().trim().split(" ");
 
   long base = Long.parseLong(l[0]);
 
   long k = Long.parseLong(l[1]);
 
   long tmp=0;
 
   int c = 0;
 
 
 
   for (int i = 0; i < k; i++) {
 
    c++;
 
    long sum = nextSum(base);
 
    result = ((long) Math.pow(sum, 3));
 if(base == result) {
 
     break;
 
    }
    if(result == tmp) {
 
     c = c-3;
 
     if((k%2!=0 && c%2==0) || (k%2==0 && c%2!=0)) {
 
      result = tmp;
 
     }else {
 
      result = base;
 
     }
 
     break;
 
    }
 
    tmp = base;
 base = result;
 
   }
sb.append(result).append("\n");
  }
 System.out.println(sb);
  } catch (Exception e) {
 System.out.println(e);
  }
 }
 }