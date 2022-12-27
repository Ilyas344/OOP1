package transport;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private Double engineVolume;
    private  String color;
    private final Integer year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private  String number;
    private final Integer seats;
    private  boolean winterSummer;
    public class Key{
private boolean launch;
private boolean keylessAccess;

        public boolean isLaunch() {
            return launch;
        }

        public void setLaunch(boolean launch) {
            this.launch = launch;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public Key(boolean launch, boolean keylessAccess) {
            if (launch==true)
            {this.launch = launch;}
           if (keylessAccess==true){
            this.keylessAccess = keylessAccess;}
        }
    }



    public Car(String brand, String model, Double engineVolume, String color, Integer year, String country,
               String transmission, String bodyType, String number, Integer seats) {
        java.util.Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        if (month<4&&month>10)
        {this.winterSummer = true;}
        else {this.winterSummer = false;}

        if (seats == null) {
            this.seats = 1;
        } else {
            this.seats = seats;
        }
        if (number == null || number.equals("")) {
            this.number = "default";
        } else {
            this.number = bodyType;
        }
        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year == null) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }



    }

    @Override
    public String toString() {
        String tire;
        if(winterSummer==true){tire="летняя";}else {tire="зимняя";}

        return "Автомобиль: " + brand +
                " " + model + ", сборка страна: " + country +
                ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color + ", " + year + " год выпуска.\nКоробка передач "+transmission+", " +
                "тип кузова " +bodyType+", рег номер "+number+", количествл мест "+seats+", резина "+tire+"\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engineVolume, car.engineVolume) && Objects.equals(color, car.color) && Objects.equals(year, car.year) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

    public String getBrand() {

        return brand;
    }



    public String getModel() {

        return model;
    }


    public Double getEngineVolume() {

        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

    }

    public void setNumber(String number) {
        if (number == null || number.equals("")) {
            this.number = "default";
        } else {
            this.number = number;
        }
    }

    public void setWinterSummer(boolean winterSummer) {
        java.util.Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        if (month<4&&month>10)
        {this.winterSummer = true;}
        else {this.winterSummer = false;}
    }

    public Integer getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }



    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumber() {
        return number;
    }

    public Integer getSeats() {
        return seats;
    }

    public boolean isWinterSummer() {
        return winterSummer;
    }
}

