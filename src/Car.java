import java.util.Objects;

public class Car {
    String brand;
    String model;
    Double engineVolume;
    String color;
    Integer year;
    String country;

    public Car(String brand, String model, Double engineVolume, String color, Integer year, String country) {
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
        return "Автомобиль: " + brand +
                " " + model + ", сборка страна: " + country +
                ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color + ", " + year + " год выпуска.";
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

    public void setBrand(String brand) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        if (model == null || model.equals("")) {
            model = "default";
        } else {
            this.model = model;
        }
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
            color = "белый";
        } else {
            this.color = color;
        }
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year == 0) {
            year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.equals("")) {
            country = "default";
        } else {
            this.country = country;
        }
    }
}
