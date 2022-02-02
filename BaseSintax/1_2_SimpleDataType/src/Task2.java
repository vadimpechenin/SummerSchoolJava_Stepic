/*
Вводятся две букв необходимо вывести сумму кодов этих букв

Sample Input:

a b
Sample Output:

195
*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        int c1 = System.in.read();
        int c2 = System.in.read();
        int c3 = System.in.read();
        c2 = c1 + c3;
        System.out.println(c2);
    }
}
