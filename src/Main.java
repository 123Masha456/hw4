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
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше 18, то он не достиг совершеннолетия, нужно немного подождать");
            ;
        }
        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Человек несовершеннолетний");
        } else {
            System.out.println("Человек совершеннолетний");
            ;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 19;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
            ;
        }
        int temp1 = -10;
        if (temp1 > 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
            ;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 130;
        if (speed > 60) {
            System.out.println("Скорость превышена, нужно оплатить штраф");
        } else {
            System.out.println("Скорость в пределах нормы, можно ездить спокойно");
            ;
        }
        int speed1 = 20;
        if (speed1 > 60) {
            System.out.println("Скорость превышена, нужно оплатить штраф");
        } else {
            System.out.println("Скорость в пределах нормы, можно ездить спокойно");
            ;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 23;
        if (age < 2) {
            System.out.println("Человеку пора спать");
        } else {
            System.out.println("Человек может бодрствовать");
            ;
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Человеку нужно ходить в десткий сад");
        } else {
            System.out.println("Человек может не ходить в детский сад");
            ;
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Человеку нужно ходить в школу");
        } else {
            System.out.println("Человек может не ходить в школу");
            ;
        }
        if (age > 18 && age < 24) {
            System.out.println("Место человека в университете");
        } else {
            System.out.println("Человек иожет не ходить в университет");
            ;
        }
        if (age > 24 && age < 60) {
            System.out.println("Человек ходит на работу");
        } else {
            System.out.println("Человек не ходит на работу");
            ;
        }
        if (age > 60) {
            System.out.println("Человек отдыхает на пенсии");
        } else {
            System.out.println("Человек занят в соотвествии со своим возрастом, который меньше 60 лет");
            ;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
            ;
        }
        if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок либо не может кататься на аттракционе, либо может без соспровождения взрослого");
        }
        if (age >= 14) {
            System.out.println("Ребенок модет кататься без сопровождения взрослого");
        } else {
            System.out.println("Ребенок либо вообще не может кататься на аттракционе, либо нужно сопровождение взрослого");
            ;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 106;
        int seat = 60;
        System.out.println("Стоячих мест " + (capacity - seat));
        System.out.println("Представим, что всего пассажиров 60 человек, из которых 54 человека купили сидячие места, а 6 человек выбрали стоячие");
        int people = 60;
        if (people > capacity) {
            System.out.println("Вагон заполнен, свободных мест нет");
        } else {
            System.out.println("Свободные места есть");
            ;

            int seat1 = 54;
            if (seat1 < seat) {
                System.out.println("Свободные сидячие места есть");
            } else {
                System.out.println("Свободных сидячих мест нет");
                ;
            }

            int CapacityMinusSeat = 6;
            if (CapacityMinusSeat < (capacity - seat)) {
                System.out.println("Свободные стоячие места есть");
            } else {
                System.out.println("Свободных стоячих мест нет");
                ;
            }

        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 48;
        int two = 68;
        int three = 2;
        if (one > two && one > three) { System.out.println("Первое число самое большое");}
        else { System.out.println("Первое число не больше остальных");;}
        if (two > one && two > three) { System.out.println("Второе число самое большое");}
        else { System.out.println("Второе число не больше всех");;}
        if (three > one && three > two) { System.out.println("Третье число самое большое");}
        else { System.out.println("Третье число не больше всех");;}


    }
}