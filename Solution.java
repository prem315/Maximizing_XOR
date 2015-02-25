import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();
        
        maXOR(L,R);
    }

    public static void maXOR(int L, int R){
        
        int max = 0;

        for(int i=L; i<=R; i++){
            for(int j=i; j<=R; j++){
                if((i^j) > max){
                    max = (i^j);
                }
            }

        }

        System.out.println(max);
    }

    
}
