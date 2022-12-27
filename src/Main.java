import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", (1.7), "желтый", 2015, "Россия",
                "ручная", "кроссовер", "Е377ЕВ777", 4);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", (3.0), "черный", 2020, "Германия", "ручная", "кроссовер", "Е377ЕВ777", 4);
        Car bmw = new Car("BMW", "Z8", (3.0), "черный", 2015, "Германия", "ручная", "кроссовер", "Е377ЕВ777", 4);
        Car kia = new Car("Kia", "Sportage 4-го поколения", (2.4), "красный", 2018, "Ю.Корея", "ручная", "кроссовер", "Е377ЕВ777", 4);
        Car hyundai = new Car("Hyundai", null, (1.6), "оранжевый", 2016, "Ю.Корея", "ручная", "кроссовер", "Е377ЕВ777", 4);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();


    }
}