/*
Окружность
Дан класс Circle, в нем необходимо реализовать методы расчета площади и периметра. pi = 3.14
*/
public class Circle {
    int x, y;
    float radius;

    float perimetr(){
        return (float) 3.14*2*radius;
    }

    float square(){
        return (float) 3.14*radius*radius;
    }

}
