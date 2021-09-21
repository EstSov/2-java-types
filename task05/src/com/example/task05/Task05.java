package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int ost =0;
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        for(int i=0;i<5;i++)
        {
            ost = x%10;
            x = x/10;
            if(ost%2 == 0)
            {
                continue;
            }
            else
            {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
