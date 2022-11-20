public class Main {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
            }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Такой комманды нет");
        }

        //Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке.");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        //Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание 4
        int deliveryDistance = 95;
        int daysPerDay = 1;
        if (deliveryDistance > 20) {
            daysPerDay++;
        }
        if (deliveryDistance > 60) {
            daysPerDay++;
        }
        System.out.println("Потребуется дней: " + daysPerDay);

        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}