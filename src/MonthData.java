import java.util.Scanner;

public class MonthData {


    int[] days = new int[30]; //обявили массив  с количеством дней

 void   printDaysAndStepsFromMonth(int inputMonth) {// вывод на экран элементов массива в необходимом формате.
        for (int i = 0; i < days.length ; i++) {

            System.out.println((i + 1) + " день: "+" количество шагов " + days[i] );
        }

    }


     int sumStepsFromMonth(){           // подсчёт суммы шагов за месяц    // подсчёт суммы элементов массива days[]
        int sumSteps = 0;
        for(int i = 0; i < days.length; i++){
        sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

   int maxSteps(){             // максимальное количество шагов за месяц     // поиск максимального элемента
        int  maxNumberSteps = 0;
        for (int i = 0; i < days[i];i++){
            if (maxNumberSteps < days[i]){
                maxNumberSteps = days[i];
            }

        }
        return maxNumberSteps;
    }

    int bestSeries(int goalByStepsPerDay){
        int bestSession = 0;
        int countBest = 0;
        for (int i = 0; i < 30; i++) {
            // поиск максимальной серии
        }
        return countBest;
    }


}

