//import java.util.Scanner;
//
//public class CommandLineMeneger {
//
//public  static  void PrintMenuAndCommand(){
//
//
//    Scanner scanner = new Scanner(System.in);
//    StepTracker  stepTracker = new  StepTracker();
////        Введите номер месяца: от 0 до 11
//    while (true) {
//        printMenu();
//        int command = scanner.nextInt();// обработка разных случаев
//        if (command == 1) {
//            System.out.println("За какой месяц хотите вести данные: Выберите число из списка");
//            System.out.print("0--Январь\n" + "1--Февраль\n"+ "2--Март\n"+ "3--Апрель\n"+ "4--Май\n"+ "5--Июнь\n"+ "6--Июль\n"+
//                    "7--Август\n"+ "8--Сентябрь\n"+ "9--Октябрь\n"+ "10--Ноябрь\n"+ "11--Декабрь\n");
//            int  month = scanner.nextInt();
//
//            System.out.println("Введите номер дня: от 0 до 29 ");
//            int day = scanner.nextInt();
//            System.out.println("Введите количества шагов:");
//            double steps = scanner.nextInt();
//            if (steps < 0){
//                System.out.println("Количество шагов должно быть неотрицательным");
//            }
//
//            stepTracker.stepsPerDay(month,day,steps);  //вызываем метод с количество шагов
//
//        } else if (command == 2) {
//            System.out.println("За какой месяц хотите статистику: введите число от 0 до 11");
//            int statisticsMonth = scanner.nextInt();
//            // stepTracker.printStatisticsStepsPerMonth(statisticsMonth);
////                System.out.println("Общее количество шагов за месяц");
////                System.out.println("Максимальное пройденное количество шагов в месяце");
////                System.out.println("Среднее количество шагов");
////                System.out.println("Пройденная дистанция (в км)");
////                System.out.println("Количество сожжённых килокалорий");
//
//        } else if (command == 3) {
//            System.out.println("Сколько вы хотите проходить шагов за день? ");
//            int purposeSteps = scanner.nextInt();
//
//        } else if (command == 0){
//            System.out.println("Программа завершена");
//            break;
//        }
//        else {
//            System.out.println("Извините, такой команды пока нет.");
//        }
//
//    }
//
//
//}
//
//
//    private static void printMenu() {
//        System.out.println("Что вы хотите сделать?");
//        System.out.println("1 -- Ввести количество шагов за определённый день");
//        System.out.println("2 -- Напечатать статистику за определённый месяц");
//        System.out.println("3 -- Изменить цель по количеству шагов в день");
//        System.out.println("0 -- Выход.");
//    }
//}
//
//
//
//
//
