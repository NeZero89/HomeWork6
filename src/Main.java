public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор Урок №2 ");

        task1();
        task2();
        task3();
        task4();
        task5();



    }

    public static void task1() {
        System.out.println("Задача №1");
        int clientOS=0;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS==1)System.out.println("Установите версию приложения для Android по ссылке");}

    public static void task2() { System.out.println("Задача №2");
        int clientOS=1;
        int clientDiviceYear=2014;
        if (clientDiviceYear<2015) {
            System.out.println("Установите ограниченную версию приложения ");}
        else if (clientDiviceYear>=2015){
            System.out.println("Установите версию приложения ");}
        if (clientOS==0) {
            System.out.println("для IOS по ссылке");}
        if (clientOS==1)System.out.println("для Android по ссылке");}


    public static void task3() {
        System.out.println("Задача №3");
        int year=2045;
        if ((year%4==0)||(year % 400==0)&&(year%100!=0)){
            System.out.println(year+" год является високосным");}
        else
            System.out.println(year+" год не является високосным");
    }
    public static void task4() {
        System.out.println("Задача №4");
        int diliveryDistsnce=95;
        if (diliveryDistsnce<=20)
            System.out.println("Потребуется 1 день");
        if (diliveryDistsnce>20&&diliveryDistsnce<60)
            System.out.println("Потребуется 2 дня");
        else if (diliveryDistsnce>60&&diliveryDistsnce<100)
            System.out.println("Потребуется 3 дня");

        else System.out.println("доставки нет");
    }
    public static void task5() {
        System.out.println("Задача №5");
        int monthNumber=40;
        switch (monthNumber){
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
                System.out.println("Нет такого месяца");
        }


    }

}