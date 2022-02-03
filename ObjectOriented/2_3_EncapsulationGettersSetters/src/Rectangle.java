/*
Геттеры и сеттеры
Необходимо написать класс Rectangle и реализовать в нем следующие методы:

getSquare() - возвращает значение площади

getWidth() - возвращает ширину

setWidth(int width) - устанавливает значение ширины

getHeight() - возвращает высоту

setHeight(int height) - устанавливает значение высоты
*/
public class Rectangle {
    private int width, height, square;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare() {
        return this.square=height*width;
    }

}
