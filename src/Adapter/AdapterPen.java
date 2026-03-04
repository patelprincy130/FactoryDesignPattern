package Adapter;

public class AdapterPen implements Pen{

    BallPen ballPen=new BallPen();
    @Override
    public void write(String str) {
        ballPen.writeWithBallPen(str);
    }
}
