class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2 = new Car("Opel", "Vectra", 2004, 1.8); //marka, model, rocznik, pojemność silnika


        System.out.printf("Samochód 1: \nMarka: %s, model: %s, rocznik: %d, pojemność: %, .1f", car1.brand,car1.model,car1.year,car1.capacity);
        System.out.printf("Samochód 2: \nMarka: %s, model: %s, rocznik: %d, pojemność: %, .1f", car2.brand,car2.model,car2.year,car2.capacity);
    }
}
