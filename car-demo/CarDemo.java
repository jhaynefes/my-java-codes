package cardemo;

// author @sollano_jhaynefe

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car(2021, Model.CONVERTIBLE, Color.BLUE);
        Car car2 = new Car(2019, Model.HATCHBACK, Color.WHITE);
        
        car1.display();
        car2.display();
    }
    
}
