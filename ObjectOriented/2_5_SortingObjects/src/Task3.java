/*
Экзамены
В городе М все учащиеся сдают обязательные экзамены по трем предметам - математика, русский язык и информатика.

Результаты записываются и обрабатываются автоматизированной информационной системой. После чего, система формирует общегородской отчет, который состоит из:

1 строка - средний балл по математике, средний балл по русскому языку, средний балл по информатике, общий средний балл - по всему городу(3 вещественных числа через пробел)

Каждая из последующих строк - номер школы, средний балл по математике, средний балл по русскому языку, средний балл по информатике, общий средний балл - по конкретной школе

Последние несколько строк - фамилии и имена учащихся, набравших лучший результат и их балл по каждому из предметов, в порядке:

1) Математика

2) Русский язык

3) Информатика

В формате - Фамилия Имя балл

Если лучший результат набрало несколько учащихся, необходимо вывести всех учащихся каждого с новой строки, отсортированных по Фамилии, а в случае одинаковых фамилий и по имени по возрастанию в лексографическом порядке

Данные в отчете отсортированы по школам по общему среднему баллу по убыванию балла

В случае равенства среднего балла, школы сортируются по среднему баллу по предметам с приоритетами 1 для математики, 2 для русского языка, 3 для информатики

Формат входных данных:

Подается целое число N - количество учащихся, которые сдают экзамен, далее следуют N строк с данными в формате:

Фамилия пробел Имя пробел номер школы пробел балл по математике пробел балл по русскому языку пробел балл по информатике

Количество школ не превосходит 100.

Количество учащихся не превосходит 10000.

Средний балл выводить с точностью до первого знака после запятой

Ответ выводить согласно примерам:

Sample Input 1:

7
Иванов Иван 32 80 80 80
Петров Петр 71 91 89 100
Олег Тинькоф 1 15 60 30
Воронов Максим 32 100 100 100
Зеленская Екатерина 1 75 99 67
Столярова Анна 17 78 87 77
Логинова Полина 89 66 54 78
Sample Output 1:

Отчет по городу: математика - 72.1, русский язык - 81.3, инфрматика - 76.0, общий средний балл - 76.5
Отчет по школам:
Школа № 71: математика - 91.0, русский язык - 89.0, инфрматика - 100.0, общий средний балл - 93.3
Школа № 32: математика - 90.0, русский язык - 90.0, инфрматика - 90.0, общий средний балл - 90.0
Школа № 17: математика - 78.0, русский язык - 87.0, инфрматика - 77.0, общий средний балл - 80.7
Школа № 89: математика - 66.0, русский язык - 54.0, инфрматика - 78.0, общий средний балл - 66.0
Школа № 1: математика - 45.0, русский язык - 79.5, инфрматика - 48.5, общий средний балл - 57.7
Лучший результат по математике - Воронов Максим - 100
Лучший результат по русскому языку - Воронов Максим - 100
Лучший результат по информатике - Воронов Максим - 100
Лучший результат по информатике - Петров Петр - 100
 */


import java.util.*;

public class Task3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<Pupil> pupils = new ArrayList<Pupil>();
        //Переменные для общих оценок
        double [] grades = new double[3];
        //Множество для номеров школ
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String name = in.next();
            String surname = in.next();
//            String fullName = surname+ " " + surname
            int schoolNumber = in.nextInt();
            int gradeMath = in.nextInt();
            int gradeRus = in.nextInt();
            int gradeInf = in.nextInt();
            // Формирование общей суммы для первой строки
            grades[0] += gradeMath;
            grades[1] += gradeRus;
            grades[2] += gradeInf;
            pupils.add(new Pupil(name, surname, schoolNumber,gradeMath,gradeRus,gradeInf));
            // Запись инфы по школам
            set.add(schoolNumber);
        }
        // Работа по школе (сначала отсортируем по номеру школы
        Collections.sort(pupils,Comparator.comparingInt(Pupil::getSchoolNumber).reversed());
        Iterator iterator = set.iterator();
        List<School> schools = new ArrayList<School>();
        boolean flag = true;
        boolean flag1 = true;
        int j = 0;
        int numberPupils = 0;
        for (int i=0; i<set.size(); i++){
            while (flag1) {
                if (flag) {
                    schools.add(new School(pupils.get(j).getSchoolNumber(), pupils.get(j).getGradeMath(),
                            pupils.get(j).getGradeRus(), pupils.get(j).getGradeInf(),
                            (pupils.get(j).getGradeMath() + pupils.get(j).getGradeRus() + pupils.get(j).getGradeInf()) / 3));
                    flag = false;
                    numberPupils+=1;
                } else if (j < number) {
                    if (pupils.get(j).getSchoolNumber() == pupils.get(j-1).getSchoolNumber()) {
                        numberPupils+=1;
                        schools.get(i).setGradeMath((schools.get(i).getGradeMath()+pupils.get(j).getGradeMath())/numberPupils);
                        schools.get(i).setGradeRus((schools.get(i).getGradeRus()+pupils.get(j).getGradeRus())/numberPupils);
                        schools.get(i).setGradeInf((schools.get(i).getGradeInf()+pupils.get(j).getGradeInf())/numberPupils);
                    }else{
                        schools.get(i).setGradeAll((schools.get(i).getGradeMath()+schools.get(i).getGradeRus()+
                                schools.get(i).getGradeInf())/3);
                        j--;
                        flag1 = false;
                        numberPupils=0;
                    }
                }else{
                    schools.get(i).setGradeAll((schools.get(i).getGradeMath()+schools.get(i).getGradeRus()+
                            schools.get(i).getGradeInf())/3);
                    break;
                }
                j++;
            }
            if (j < number) {
                flag1 = true;
                flag = true;
            }
        }

        System.out.println(String.format(Locale.ENGLISH,"Отчет по городу: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f",
                grades[0]/number,grades[1]/number, grades[2]/number,(grades[0]+grades[1]+grades[2])/(number*3)));
        System.out.println("Отчет по школам:");
        Collections.sort(schools,Comparator.comparingDouble(School::getGradeAll).reversed());
        for (int i=0; i<set.size(); i++){
//            if(i>0) System.out.println();
            System.out.printf("Школа № %d",schools.get(i).schoolNumber);
//            System.out.printf(String.format(Locale.ENGLISH,"Школа № %.1f",schools.get(i).gradeMath));
            System.out.print(String.format(Locale.ENGLISH,": математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f",
                    schools.get(i).gradeMath,schools.get(i).gradeRus,schools.get(i).gradeInf, schools.get(i).gradeAll));
//            System.out.println(String.format(Locale.ENGLISH,"Школа № %d: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f",
//                    schools.get(i).schoolNumber, schools.get(i).gradeMath,schools.get(i).gradeRus,schools.get(i).gradeInf));
            System.out.println();
        }

        //Сортировка учеников по оценкам (математике)
        Collections.sort(pupils,Comparator.comparingInt(Pupil::getGradeMath).reversed().thenComparing(Comparator.comparing(Pupil::getSurname).thenComparing(Comparator.comparing(Pupil::getName))));
        flag = true;
        int i = 0;
        while (flag) {
            System.out.println("Лучший результат по математике - " + pupils.get(i).surname + " " + pupils.get(i).name + " - " + pupils.get(i).gradeMath);
            if (i < number){
                if (pupils.get(i+1).gradeMath < pupils.get(i).gradeMath){
                    flag = false;
                }else{
                    i++;
                }
            }
        }

        //Сортировка учеников по оценкам (русский язык)
        Collections.sort(pupils,Comparator.comparingInt(Pupil::getGradeRus).reversed().thenComparing(Comparator.comparing(Pupil::getSurname).thenComparing(Comparator.comparing(Pupil::getName))));
        flag = true;
        i = 0;
        while (flag) {
            System.out.println("Лучший результат по русскому языку - " + pupils.get(i).surname + " " + pupils.get(i).name + " - " + pupils.get(i).gradeRus);
            if (i < number){
                if (pupils.get(i+1).gradeRus < pupils.get(i).gradeRus){
                    flag = false;
                }else{
                    i++;
                }
            }
        }

        //Сортировка учеников по оценкам (информатика)
        Collections.sort(pupils,Comparator.comparingInt(Pupil::getGradeInf).reversed().thenComparing(Comparator.comparing(Pupil::getSurname).thenComparing(Comparator.comparing(Pupil::getName))));
        flag = true;
        i = 0;
        while (flag) {
            System.out.println("Лучший результат по информатике - " + pupils.get(i).surname + " " + pupils.get(i).name + " - " + pupils.get(i).gradeInf);
            if (i < number){
                if (pupils.get(i+1).gradeInf < pupils.get(i).gradeInf){
                    flag = false;
                }else{
                    i++;
                }
            }
        }

    }

}
