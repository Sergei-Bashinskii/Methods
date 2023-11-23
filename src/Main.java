import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        if (conditionsLeapYear(year)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }

    }
    public static boolean conditionsLeapYear (int year) {
        int fourthYear = year % 4;
        int hundredYear = year % 100;
        int fourHundredYear = year % 400;
        if (year >= 1584) {
            return fourthYear == 0 && hundredYear != 0 || fourHundredYear == 0;
        } else {
            return false;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int year = LocalDate.now().getYear();
        int clientOS = 1;
        if (yearOfRelease(year) && systemVersion(clientOS)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (yearOfRelease(year) && !systemVersion(clientOS)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!yearOfRelease(year) && systemVersion(clientOS)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!yearOfRelease(year) && !systemVersion(clientOS)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static boolean yearOfRelease(int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean systemVersion (int clientOS) {
        if (clientOS == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        time(deliveryTime);

    }

    public static int calculateDeliveryTime(int deliveryDistance){
        int day = 1;
        if (deliveryDistance <= 20){
            return day;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            return day + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return day + 2;
        } else {
            return -1;
        }
    }

    public static void time(int days) {
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}