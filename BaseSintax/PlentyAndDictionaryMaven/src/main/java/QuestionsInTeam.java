import java.util.*;

public class QuestionsInTeam {
    public static void main(String[] args){
        int[] a = {12, 33333, 7, 130};
//        ArrayList<String> b = new ArrayList<String>();
        String[] b = {"aa", "ab", "Ac", "BBB"};
        String[] c = {"aa", "ab", "Ac", "BBB"};
        String[] d = {"12", "33333", "7", "130"};
        int[] e = {1, 12, 12, 3, 5, 7};
        String[] f = {"12", "33333", "7", "130"};
        int[] h = {1, 7, 12, 3, 3, 3, 4};
        String[] i = {"aA", "aa", "aaa", "aAa", "aaA"};
        firstQuestionInteger(a);
        firstQuestionString(b);
        firstQuestionString(c);
        firstQuestionString(d);
        firstQuestionInteger(e);
        firstQuestionString(f);
        firstQuestionInteger(h);
        firstQuestionString(i);

    }

    static void firstQuestionInteger(int [] a){

        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i: a)
            set.add(i);
        for(int i : set) System.out.print(i + " ");
        System.out.println(" ");
    }

    static void firstQuestionString(String [] a){

        TreeSet<String> set = new TreeSet<String>();
        for(int i = 0; i< a.length; i++)
            set.add(a[i]);
        for(String i : set) System.out.print(i + " ");
        System.out.println(" ");

    }

    static void setFunctionTasks(){
//        Задача на множество - задача сборки алфавита строки
        // Вход - Karl u Klari ukral koralli, a Klara ukrala u Karla klarnet
        Scanner in = new Scanner(System.in);
        TreeSet<Character> treeSet = new TreeSet<>();
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                treeSet.add(s.charAt(i));
            }
        }
        System.out.println(treeSet);
        for (Character i : treeSet){
            System.out.print(i + " ");
        }
    }

}
