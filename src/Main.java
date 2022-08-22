public class Main {
    public static void main(String[] args) {
       //Task 1
        int clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();


        //Task 2
        clientOS = 0;
        int clientDeviceYear = 2017;
        if(clientDeviceYear < 2015){
            if(clientOS == 0 && clientDeviceYear >= 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else{
            if(clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();


        //Task 3
        int year = 1992;
        if(year%4 == 0 && year%100 == 0 && year%400 == 0){
            System.out.println(year + " год является високосным");
        }else if(year%4 == 0 && year%100 != 0) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
        System.out.println();


        //Task 4
        int deliveryDistance = 95;
        int dayCounter = 1;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: " + dayCounter);
        } else if(deliveryDistance >=20 && deliveryDistance < 60){
            dayCounter++;
            System.out.println("Потребуется дней: " + dayCounter);
        } else{
            dayCounter += 2;
            System.out.println("Потребуется дней: " + dayCounter);
        }
        System.out.println();


        //Task 5
        int month = 13;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect number");

        }
        System.out.println();


        //Task 6
        
    }
}
