/*
Автомобиль
        Необходимо спроектировать класс Car таким образом, чтобы в нем были поля:

        countOfKm - пробег в км

        levelOfFuel - количество бензина (не более 60 литров)

        И методы:

        fueling с одним целочисленным параметром, который увеличивает количество бензина на значение переданного параметра
        go с одним целочисленным параметром, который увеличивает пробег на значение переданного параметра в км, но тратит топливо из расчета 10 л / 100 км
        */


public class Car {
    int countOfKm;
    int levelOfFuel;

    public void fueling(int fuel){
        levelOfFuel += fuel;
        if (levelOfFuel>60){
            levelOfFuel=60;
        }
    }

    public void go(int km){
        countOfKm += km;
        levelOfFuel-=km/10;
    }
}
