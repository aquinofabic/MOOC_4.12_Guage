public class Main {
    public static void main(String[] args) {
        Guage g = new Guage();

        while (!g.isFull()) {  // value is not 5 so !g.isFull() returns true!
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }
        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}