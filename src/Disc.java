public class Disc extends Computer{
    private int capacity;

    public Disc(String name, String producent, String serialNumber, int capacity) {
        super(name, producent, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
