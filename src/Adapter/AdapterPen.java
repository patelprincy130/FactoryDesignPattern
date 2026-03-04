package Adapter;

public class AdapterPen implements Pen{

    BallPen ballPen=new BallPen(); //using BallPen's implementation with composition
    @Override
    public void write(String str) {
        ballPen.writeWithBallPen(str);
    }
}
