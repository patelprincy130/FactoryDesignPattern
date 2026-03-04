package builder;

public class Phone {
    private String color;
    private String processor;
    private int ram;
    private int screensize;
    private int battery;

    public Phone(String color, String processor, int ram, int screensize, int battery) {
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.screensize = screensize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", screensize=" + screensize +
                ", battery=" + battery +
                '}';
    }
}
