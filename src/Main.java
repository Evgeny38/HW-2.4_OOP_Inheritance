public class Main {
    public static Car[] cars = new Car[5] ;
    public static void printCar(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    public static Train[] trains = new Train[2];
    public static void printTrain(){
        for (Train train : trains) {
            System.out.println(train);
        }
    }
    public static Bus[] buses = new Bus[3];
    public static void printBus(){
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car1 = new Car("LADA","GRANTA",2015,"Россия","жёлтый",1600,
                1.7,"АКПП", "лифтбэк", "A762КА138",25,
                "W");
        Car car2 = new Car("AUDI","A8 50L TDI quattro",2020,"Германия","чёрный",
                240,3.0,"АКПП","седан","Е111ЕЕ11",
                5,"W");
        Car car3 = new Car("BMW","Z8",2021,"Германия","чёрный",280,
                3.0,"МКПП","родстер","СЫНДЕПУТАТА",2,
                "S");
        Car car4= new Car("KIA","SPORTAGE 4",2018,"Южная Корея","красный",
                180,2.4,"АКПП","кроссовер","Р777УС777",
                5,"S");
        Car car5 = new Car("HYUNDAY","AVANTE",2016,"Южная Корея","оранжевый",
                180,1.6,"АКПП","седан","Ы001ЪЮ",
                5,"W");
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        System.out.println();
        printCar();
        System.out.println();
        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия", "",
                301, 3500, 3, "Минск-пассажирский",
                "Станция Минск", 11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", "",
                270, 1700, 4.5, "Ленинградский вокзал",
                "Ленинград-пассажирский", 8);
        trains[0] = train1;
        trains[1] = train2;

        printTrain();
        System.out.println();

        Bus bus1 = new Bus("ЛИАЗ", "5292 рестайл", 2020, "Россия", "Синий",
                200);
        Bus bus2 = new Bus("КАВЗ", "4238", 2023, "Россия", "Серый",
                240);
        Bus bus3 = new Bus("ГАЗ", "Вектор NEXT", 2023, "Россия", "Белый",
                300);
        buses[0] = bus1;
        buses[1] = bus2;
        buses[2] = bus3;

        printBus();



    }
}