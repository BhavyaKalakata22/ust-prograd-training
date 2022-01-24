import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Solution {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        char[] pal = s.toCharArray();
        
        // **** initialize indices ****
        int l = 0;
        int r = s.length() - 1;
        
        // **** attempt to make the string a palindrome ****      
        while (l < r) {
            
            // **** replace left and right by their max ****
            if (s.charAt(l) != s.charAt(r)) {
                pal[l] = pal[r] = (char)Math.max(s.charAt(l), s.charAt(r));
                k--;    
            }
            

            // **** updated indices ****
            l++;
            r--;
        }
 

        // **** check if we are done **** 
        if (k < 0) {
            return "-1";
        }
        
//        System.out.println("---- ---- ----");
        
        // **** initialize indices ****
        l = 0;
        r = s.length() - 1;
        
        // **** second pass (check if we can update digits to '9') ****
        while (l <= r) {
            
            // **** change mid character to '9' ****
            if ((l == r) &&
                (k > 0)) {
                pal[l] = '9';
            }

            // **** check on left character ****
            if (pal[l] < '9') {
                
                // **** we can update them with cost of 2 ****
                if (k >= 2 &&
                    pal[l] == s.charAt(l) && 
                    pal[r] == s.charAt(r)) {
                    pal[l] = pal[r] = '9';
                    k -= 2;
                }
                
                // **** we can update them with cost 1 ****
                else if (k >= 1 &&
                        (pal[l] != s.charAt(l) || pal[r] != s.charAt(r))) {
                     pal[l] = pal[r] = '9';
                       k--;
                }    
            }
            
//               System.out.println("pal: " + new String(pal));
//               System.out.println("         s: " + s);
//            System.out.println("l: " + l + " r: " + r + " k: " + k + "\n");
             
            // **** updated indices ****
            l++;
            r--;
        }
        
//           System.out.println("pal: " + new String(pal));
//           System.out.println("         s: " + s);
//        System.out.println("l: " + l + " r: " + r + " k: " + k + "\n");

        // **** ****
        return new String(pal);
     }

    
    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) throws IOException {
        
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}