public class Guage {
    private int value;
    public Guage() {
    }
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }
    public void decrease() {
        if (this.value > 0)
            this.value--;
    }
    public int value() {
        return this.value;
    }
    public boolean isFull() {
        return this.value == 5;  // returns true if the value is equal to 5, false if not
    }
}

/*
can also be written as:

public boolean isFull() {
    if (this.value != 5) {
        return false;
    }
    return true;
}
 */
