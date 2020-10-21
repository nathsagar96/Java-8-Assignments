package assignment2;

public interface Piano {
    default void play() {
        System.out.println("Playing Piano");
    }
}
