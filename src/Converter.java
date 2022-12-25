public class Converter {


   public int convertToKm(int steps){    //преобразование шагов в километры
        int kilometers = (steps * 75)/10000;
        return kilometers;
    }

    double convertStepsToKilocalories(double steps){ //метод, переводящий количество шагов в килокалории.
        double kilocalories = steps * 50 / 1000;
        return kilocalories;
    }


}








