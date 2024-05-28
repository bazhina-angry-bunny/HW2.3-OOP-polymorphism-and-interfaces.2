package hw16_oop;
/*
public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
}
 */

public class ServiceStation {
    //Станция техобслуживания
//используем полиморфизм для передачи праметра - массив общего типа данных, чтобы с увеличением видов транспотра не забыть принять новый параметр
    public void check(Transportable[] transportables) {
        for (Transportable transportable : transportables) {
            if (transportable != null) {
                transportable.repair();
            }
        }
    }
    //можно принемаемые параметры записать в форме war args
    //public void check(Transportable[] transportables) { }  ==>>  public void check(Transportable ... transportables) { }
    //и тогда в mail не обязательно создавать массив, а можно передавать как бы любое количество элементов массива:
    // создадим экземпляр однозначно   ServiceStation serviceStation = new ServiceStation();
    // serviceStation.check(new Transportable[]{car, car2, truck, truck, bicycle, bicycle2});
    // ==>> serviceStation.check(car, car2, truck, truck, bicycle, bicycle2); а можем и один из этих элементов передать
}