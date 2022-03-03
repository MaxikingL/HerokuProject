package CarFleetApp;

public class CarFleetApp {
    public static void main(String[] args) {

        Car firstCar = new Car(1,"OPEL","Vectra");
        firstCar.setEngineType(CarEngineType.DIESEL);
        Car secondCar = new Car(2,"FIAT","Multipla");
        secondCar.setEngineType(CarEngineType.DIESEL);


        System.out.println(firstCar);
        System.out.println(secondCar);




    }
}
