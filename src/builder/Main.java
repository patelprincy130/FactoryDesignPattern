package builder;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //this is how we create obj without using builder design pattern- we have to remember sequence of the parameters and we have to pass all parameters
        Phone p=new Phone("white","mediaTek",32,5,3200);
        System.out.println(p);
        //we can set values using constructor or setter

        //using PhoneBuilder
        PhoneBuilder pb=new PhoneBuilder();
        pb.setColor("Black");
        pb.setRam(16);
        Phone phone=pb.getPhone();
        System.out.print(phone);

        //OR
        Phone newPhone=new PhoneBuilder().setBattery(3100).setColor("Blue").getPhone();
        System.out.print(newPhone);
        //here parameters' sequence is not mandatory and we can pass either 1 or 2 or whatever params we want.
        //rest params will get default values.
    }
}
