package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int tentArea = k*k;
        int tentsArea = 0;
        int count =0;
        int kInN=n/k;
        int kInM=m/k;
        for(int i=0;i<kInN;i++)
        {
            for(int j=0;j<kInM;j++)
            {
                count +=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1000000, 1000000, 50);
        System.out.println(result);


    }

}
