/*
Самое длинное слово
Реализуйте функцию, возвращающую самое длинное слово из переданного массива.
Если таких слов много - необходимо вернуть наименьшее в лексографическом порядке.

Sample Input 1:

i'm gonna make a change for once in my life it's gonna feel real good gonna make a difference
Sample Output 1:

difference
 */


public class Task4 {

    static String maxLengthWord(String [] s){
        String max = s[0];
        for (String i : s) {
            if (i.length() > max.length())
                max = i;

            if (i.length() == max.length()){
                int index = i.compareTo(max);
                if (index < 0){
                    max = i;
                }
            }

        }
        System.out.print(max);
        return max;

    }
}