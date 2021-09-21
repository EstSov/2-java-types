package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x+y;
        int count =0;
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String str = Integer.toString(sum);
        if(str.startsWith("-"))
        {
            count = str.length();
            return count-1;
        }
        count = str.length();
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
