public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", (1.7), "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", (3.0), "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", (3.0), "черный", 2015, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", (2.4), "красный", 2018, "Ю.Корея");
        Car hyundai = new Car("Hyundai", null, (1.6), "оранжевый", 2016, "Ю.Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();
        lada.setBrand(null);
        bmw.setColor("");
        audi.setCountry(null);
        kia.setYear(0);
        hyundai.setModel("");
        bmw.setEngineVolume(0.);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}