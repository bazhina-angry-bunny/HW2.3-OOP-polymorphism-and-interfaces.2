package hw16_oop;
/*  Поправить исходный код так, чтобы он учитывал изученные принципы ООП (инкапс, наслед, полиморф).
- Критерии оценки по всем заданиям
– В исправленном коде применен принцип полиморфизма.
– В исправленном коде применен принцип наследования.
– В исправленном коде применен принцип инкапсуляции.
– В исправленном коде применена перегрузка методов.

 public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
 */

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car1", 5);
        Car car2 = new Car("car2", 2);
        car.setModelName("Opel");
        car2.setModelName("Mazda");
        car.setWheelsCount(4);
        car2.setWheelsCount(2);

        Truck truck = new Truck("truck1",3);
        Truck truck2 = new Truck("truck2",5);
        truck.setModelName("Toyota");
        truck2.setModelName("MAN");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("bicycle1",4);
        Bicycle bicycle2 = new Bicycle("bicycle2",3);
        bicycle.setModelName("Altair");
        bicycle2.setModelName("Crolan");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(new Transportable[]{car, car2, truck, truck, bicycle, bicycle2});

        /*
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
        */
    }
}