/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

*/

import java.util.*;
public class PalProd {
   
    public static boolean isPal(int n){
        boolean retVal = false;

        String num = String.valueOf(n);
        StringBuilder reverseNum = new StringBuilder();

        for(int i = num.length()-1; i >=0; i--){
            reverseNum.append(num.charAt(i));
        }

        if(num.equals(reverseNum.toString())){
            retVal = true;
        }



        return retVal;
    }

    public static int selectMax(List<Integer> list){
        int max = 0;

        for(int i = 0; i < list.size(); i++){
            int val = list.get(i);
            if(val > max){
                max = val;
            }
        }


        return max;
    }
   
   
    public static void main(String args[]){
        int palindrome = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 999; i>=100; i--){
            for(int j = 999; j >= 100; j--){
                int prod = i*j;
                if(isPal(prod)){
                    palindrome = prod;
                    list.add(prod);
                    break;
                }
            }
        }

        int maxPal = selectMax(list);

        System.out.println("Largest pal is " + maxPal);
    }
}