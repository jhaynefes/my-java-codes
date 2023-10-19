package cardemo;

public class Car {
    private int year;
    private Model model;
    private Color color;
    
    public Car(int yr, Model m, Color c){
        year = yr;
        model = m;
        color = c;
    }
    public void display(){
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
