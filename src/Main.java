public class Main {
    public static void main(String[] args) {
        // task1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Скачайте приложение для IOS");
        }
        else if (clientOS == 1) {
            System.out.println("Скачайте приложение на Android");
        }
        else {
            System.out.println("Неверное знание");
        }
        // task2
        int clientDeviceYear = 2014;
                if (clientDeviceYear < 2015 && clientOS == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
                    System.out.println("Скачайте приложение на IOS");
                }
                if (clientDeviceYear < 2015 && clientOS == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (clientDeviceYear >= 2015 && clientOS == 1) {
                    System.out.println("Скачайте приложение на Android");
                }
        // task3
        int year= 2024;
                if((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)) {
                    System.out.println("Год високосный.");
                } else {
                    System.out.println("Год не високосный.");
                }
        // task4
        int distance = 29;
                int time = 1;
                if (distance > 20) {
                    ++time;
                }
                if (distance > 60) {
                    ++time;
                }
                if (distance > 100) {
                    time = -1;
                }
                if (time == -1) {
                    System.out.println("Не можем доставить.");
                } else {
                    System.out.println("Доставка займет " + time + " дней.");
                }


        // task 5
        int monthNumber = 6;
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
                }

    }

}