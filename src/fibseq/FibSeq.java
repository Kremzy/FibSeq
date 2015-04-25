/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibseq;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous 
 * two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class FibSeq {
    public static void main(String[] args) {
        int fib1, fib2, sum, evens;
        fib1=0;
        fib2=1;
        sum=0;
        evens=0;
        System.out.println("Fibonacci Sequence, evens only:");
            while (sum<4000000)
            {
                sum += fib1;
                fib1 = fib2;
                fib2 = sum;
                 
                if (sum%2==0)
                {
                System.out.println(sum);
                evens+=sum;
                }
            }
        System.out.println("Sum of the evens under 4 million: " + evens);
    }
}
 
