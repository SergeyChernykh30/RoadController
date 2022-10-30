import core.*;
import core.Camera;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RoadController {
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 3500; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        /*System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }*/

        Car justCar = new Car();

        String justCarNumber = justCar.setNumber("A666AA159");
        int justCarHeight = justCar.setHeight(1560);
        double justCarWeight = justCar.setWeight(2580.00);
        boolean justCarVehicle = justCar.setVehicle(false);
        boolean justCarIsSpecial = justCar.setSpecial(false);

        System.out.println("Car number is " + justCar.getNumber());
        System.out.println("Car height is " + justCar.getHeight());
        System.out.println("Car weight is " + justCar.getWeight());
        System.out.println("Car has vehicle " + justCar.getHasVehicle());
        System.out.println("Car is special? " + justCar.getIsSpecial());
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        int carHeight = car.height;
        double weight = car.weight;
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight || weight > passengerCarMaxWeight)
            {
                price = cargoCarPrice;
                if (car.hasVehicle)
                {
                    price = price + vehicleAdditionalPrice;
                }
        }

        else
        {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }

}