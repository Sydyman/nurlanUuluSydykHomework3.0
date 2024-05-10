public class Main {
    public static void main(String[] args) {

        double[] numbers = {2.2, 2.5, -1.8, -1.1, 4.4, 5.0, -2.3, -3.2, 2.0, 6.3, -5.5, -3.5, 5.2, 4.6, 1.3};
        double average = 0.0;
        int count = 0;
        boolean flag = false;
        for (double elements : numbers) {
            if (elements < 0){
                flag = true;
            }
            if(elements > 0 && flag){
                average +=elements;
                count += 1;
            }
        }
        if (flag == false)
            System.out.println("отрицательных чисел нет");
        else{
            System.out.println("сумма чисел: " + average);
            System.out.println("количество положительных чисел: " + count);
            System.out.println("среднее арифметическое: " + (average / count));
        }

    }
}
