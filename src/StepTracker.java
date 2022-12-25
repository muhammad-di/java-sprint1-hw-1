import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData;  // создали поле с массивом
    int goalByStepsPerDay = 10000;
    Converter localConverter;


    StepTracker(Scanner scan) { // конструктор с аргументом поле класса
        localConverter = new Converter();
        scanner = scan;
        monthData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthData[i] = new MonthData(); //  каждый новый месяц новый класс
        }


    }




    void addNewNumberStepsPerDay(Scanner scan) {   //добавить новое каличество шагов в день

        System.out.println("Введите номер месяца:");
        int inputMonth = scan.nextInt();
        if (inputMonth < 0 || inputMonth > 11) {
            System.out.println("Неверная команда:выберите число от 0 до 11");
        } else {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int inputDays = scan.nextInt();
            if (inputDays < 1 || inputDays > 30) {
                System.out.println("Номер вводимого дня должен быть от 1 до 30 включительно");
            } else {
                System.out.println("Введите количество шагов:");
                int inputSteps = scan.nextInt();
                if (inputSteps < 0) {
                    System.out.println("Количество шагов должно быть положительным числом");
                } else {
                    // сохранение данных
                    MonthData monthData1 = monthData[inputMonth]; // обявили экекмпляр класса (Month)
                    monthData1.days[inputDays - 1] = inputSteps;

                }
            }
        }
    }



    void changeStepGoal(Scanner scan) {//изменение цель шага
        System.out.println("Введите количества шагов");
        goalByStepsPerDay = scan.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Количества шагов не должно быть отрицательным или равным нулю");
        } else {
            System.out.println("Цель количества  шагов сохранено!");

        }
    }

    void printStatistic(Scanner scan) {
        System.out.println("Введите номер месяца");
        int inputMonth = scan.nextInt();
        if (inputMonth < 0 || inputMonth > 11) {
            System.out.println("Неверная команда:выберите число от 0 до 11");
        }
            MonthData monthData1 = monthData[inputMonth];
       long sumSteps = monthData1.sumStepsFromMonth();


        System.out.println("Количество пройденных шагов по дням");
         monthData1.printDaysAndStepsFromMonth(inputMonth);
        System.out.println("Общее количество шагов за месяц " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов в месяце " + monthData1.maxSteps());
        System.out.println("Cреднее количество шагов " + sumSteps/30);
     //   System.out.println("Пройденная дистанция (в км) " + );


        }

    }



