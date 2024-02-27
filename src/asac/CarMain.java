package asac;

public class CarMain {

    public static void main(String[] args) {
        CarImpl[] cars = new CarImpl[3];

        CarImpl car1 = new CarImpl("아반떼AD","현대",2015,10000000);
        cars[0] = car1;

        CarImpl car2 = new CarImpl("C-Class","Mercedes-Benz",2022,55000);
        cars[1] = car2;

        CarImpl car3 = new CarImpl("911","Porsche",2020,100000);
        cars[2] = car3;

        for (CarImpl car : cars) {
            System.out.println(car.carList());
        }
    }
}
