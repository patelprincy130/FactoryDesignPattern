package builder;

public class PhoneBuilder {
    private String color;
    private String processor;
    private int ram;
    private int screensize;
    private int battery;

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreensize(int screensize) {
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

//    public void setBattery(int battery) {
//        this.battery = battery;
//    }

    public Phone getPhone(){
        return new Phone(color,processor,ram,screensize,battery);
    }
}
