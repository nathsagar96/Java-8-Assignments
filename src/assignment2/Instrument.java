package assignment2;

public class Instrument implements Piano, Guitar{

    public void play() {
        System.out.println("Method 1: Playing Instrument");
        System.out.println("Method 2:");
        Guitar.super.play();
        Piano.super.play();
    }

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();
    }
}
