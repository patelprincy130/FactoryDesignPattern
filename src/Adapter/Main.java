package Adapter;

public class Main {
    public static void main(String[] args) {
        Assignment as=new Assignment();
        //this is not possible, since the pen is interface we cant create obj of pen and pass it to Assignment class
//        Pen p=new Pen();
//        as.setP(p);

        //but we have class for ballPen which writer, how to combine pen and ballpen class ? OR how pen class can use ballpen -->Adapter
        //so adapter class implements pen interface, will take the ballpen class and returns pen

//        AdapterPen pen=new AdapterPen();
        Pen pen=new AdapterPen();
        as.setP(pen);
        as.writeAssignment("Writing assignment");
    }
}
