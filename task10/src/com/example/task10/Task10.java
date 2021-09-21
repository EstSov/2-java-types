package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if(Float.isNaN(a)){
            if(Float.isNaN(b)){
                return true;
            }
            else return false;
        }
        else if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return a == b;
        }
        else{
            return Math.abs(a - b) < Math.pow(0.1, precision);
        }
    }

    public static void main(String[] args) {

        boolean result = compare(541.162f, 541.162f, 0);
        System.out.println(result);

    }

}
