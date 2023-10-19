package triprismdemo;

// author @sollano_jhaynefe

class TriPrism<T> {
    private T length;
    private T base;
    private T height;
    //first pair of getter and setter
    public T getLength() {
        return length;
    }
    public void setLength(T length) {
        this.length = length;
    }
    //second pair of getter and setter
    public T getBase() {
        return base;
    }
    public void setBase(T base) {
        this.base = base;
    }
    //third pair of getter and setter
    public T getHeight() {
        return height;
    }
    public void setHeight(T height) {
        this.height = height;
    }
}

public class TriPrismDemo {
    public static void main(String[] args) {
        //TriPrism object 1
        TriPrism<Integer> tp1 = new TriPrism<>();
        tp1.setLength(11);
        tp1.setBase(7);
        tp1.setHeight(9);
        
        //volume formula for object 1
        double volume1 = tp1.getLength() * (0.5 * tp1.getBase() * tp1.getHeight());
        
        System.out.println("Triangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight() );
        System.out.println("Volume of TriPrism 1: " + volume1);
        
        //spacer
        System.out.println(" ");
        
        //TriPrism object 2
        TriPrism<Double> tp2 = new TriPrism<>();
        tp2.setLength(7.11);
        tp2.setBase(10.0);
        tp2.setHeight(9.9);

        //volume formula for object 2
        double volume2 = tp2.getLength() * (0.5 * tp2.getBase() * tp2.getHeight());

        System.out.println("Triangular Prism 2");
        System.out.println("Length: " + tp2.getLength());
        System.out.println("Base: " + tp2.getBase());
        System.out.println("Height: " + tp2.getHeight() );
        System.out.println("Volume of TriPrism 2: " + volume2);
    }
}
