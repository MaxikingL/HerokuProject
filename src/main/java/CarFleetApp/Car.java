package CarFleetApp;

import io.cucumber.java8.Ca;

import java.util.Objects;

public class Car {

    private int id;
    private short seats;
    private String model;
    private String brand;
    private CarEngineType engineType;


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        //jest równoznaczne z........
        if (obj instanceof Car) {
            return false;
        }
        Car car = (Car) obj;

        return id == car.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seats, model, brand, engineType);
    }

    public Car(int id) {
        this.id = id;
    }

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }
    //Konstruktor który przyjmuje id , model, brand samochodu
    //jako jeden napis, wartosci oddzielone od siebie przecinkami
    //"ID,BRAND,MODEL"


    public Car(String carCsvText) {
        String[] table = carCsvText.split(",");
        for (int i = 0; i < table.length; i++) {

            System.out.println(table[i]);

        }
    }


    public Car( int id, String brand){

            this.id = id;
            this.brand = brand;
        }
        public void setEngineType (CarEngineType engineType){
            this.engineType = engineType;
        }


        public void setModel (String model){
            this.model = model;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public void setId ( int id){
            this.seats = seats;
        }


        public void setSeats ( short seats){
            this.seats = seats;
        }

        public int getId () {
            return id;
        }
        public String getModel () {
            return model;
        }
        public String getBrand () {
            return brand;
        }

        public CarEngineType getEngineType () {
            return engineType;
        }

        public short getSeats () {
            return seats;
        }
        @Override
        public String toString () {
            return "Car{" +
                    "id=" + id +
                    ", seats=" + seats +
                    ", model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", engineType='" + engineType + '\'' +
                    '}';
        }


    }

