/*
Сортировка учащихся
Класс ученик имеет поля имя и оценка. Программа получает на вход число N, далее следует N строк с данными в формате:

Имя пробел оценка.

Необходимо отсортировать данный список учеников по убыванию оценок. В случае равных оценок учеников необходимо отсортировать по возрастанию имени.

Sample Input 1:

5
Mike 5
Brus 4
Saima 3
Luke 3
Jason 3
Sample Output 1:

Mike 5
Brus 4
Jason 3
Luke 3
Saima 3
 */

import java.util.*;

public class Task2 {
    public static void task2(){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        //Student[] student = new Student[number];
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < number; i++) {
            String name = in.next();
            int grade = in.nextInt();
            //student[i] = new Student(name,grade);
            students.add(new Student(name,grade));

        }
        Collections.sort(students,Comparator.comparingInt(Student::getGrade).reversed().thenComparing(Comparator.comparing(Student::getName)));
        /*for (Student s : students){
            System.out.println(s.name+ " " + s.grade);
        }*/
        for (int i = 0; i < number; i++) {
            System.out.println(students.get(i).name + " " + students.get(i).grade);
        }
    }
}
