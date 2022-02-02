/*
printN
Реализуйте процедуру, которая выводит на экран последовательность в соответствии с условием.

Sample Input 1:

3
Sample Output 1:

122333 */


public class Task2{

    static void printN1(int n){

        if (n < 2) {
            System.out.print(n);
            return;
        }else{
            for (int i=0; i<n; i++){
                System.out.print(n);
            }
            n--;
            printN1(n);
        }
    }

    static void printN(int n){
        int k = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(k);
            }
            k++;
        }

    }
}