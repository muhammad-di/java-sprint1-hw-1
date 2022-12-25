import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true){
            ptintMenu();
            int command = scanner.nextInt();

            if(command == 1){
                stepTracker.addNewNumberStepsPerDay(scanner);
            }
            else if (command == 2) {
                stepTracker.changeStepGoal(scanner);

            }
            else if (command == 3) {
                stepTracker.printStatistic(scanner);


            } else if (command == 0) {
                System.out.println("Пока!");
                scanner.close();
                break;
            }
            else {
                System.out.println("Извините, пока такой команды нет");
            }


        }


    }
    public  static  void ptintMenu(){
        System.out.println("Введие команду");
        System.out.println("1 -- Ввести количество шагов за определённый день");
        System.out.println("2 -- Изменить цель по количеству шагов в день");
        System.out.println("3 -- Напечатать статистику за определённый месяц"); // должжен вернуть результат
        System.out.println("0 -- Выйти из приложения");
    }
}
