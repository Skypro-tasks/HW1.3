public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }


    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }


    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2017;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            clientOS = 2;
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            clientOS = 3;
        }
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 2:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 3:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
        }
        System.out.println();
    }


    public static void task3() {
        int year = 1992;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }


    public static void task4() {
        int deliveryDistance = 95;
        int dayCounter = 1;

        if (deliveryDistance >= 20) {
            dayCounter++;
        }
        if (deliveryDistance >= 60) {
            dayCounter++;
        }

        System.out.println("Потребуется дней: " + dayCounter);
        System.out.println();
    }


    public static void task5() {
        int monthNumber = 8;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect month");
        }

        System.out.println();
    }


    public static void task6() {
        int age = 19;
        int salary = 58_000;
        int creditLimit;
        if (age > 18 && age < 23) {
            creditLimit = salary * 2;
            if (salary >= 50_000) {
                creditLimit *= 1.2;
            } else if (salary >= 80_000) {
                creditLimit *= 1.5;
            }
        } else {
            creditLimit = salary * 3;
            if (salary >= 50_000) {
                creditLimit *= 1.2;
            } else if (salary >= 80_000) {
                creditLimit *= 1.5;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        System.out.println();
    }


    public static void task7() {
        int age = 25;
        int salary = 60_000;
        double interestRate = 1.1;
        int loanTerms = 12;
        double maximumMonthlyPayment = salary * 0.5;
        int wantedSum = 330_000;
        double monthlyPayment;

        if (age < 23) {
            interestRate *= 1.01;
        } else if (age < 30) {
            interestRate *= 1.005;
        }

        if (salary > 80_000) {
            interestRate = interestRate - (interestRate * 0.007);
        }

        monthlyPayment = wantedSum * interestRate / loanTerms;
        if (maximumMonthlyPayment < monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maximumMonthlyPayment +
                    " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maximumMonthlyPayment +
                    " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено");
        }
    }


}
