package bt.XayDungLopFan;

public class Fan {

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        this.radius = 5 ;
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        this.color = "blue" ;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW ;

    private boolean on  ;
    private double radius  ;
    private String color ;

    public void toString1 (){
        if (this.on){
            System.out.println("quạt đang bật");
            System.out.println("tốc độ là:"+ speed);
            System.out.println("màu:" + color);
            System.out.println("bán kính :" + radius);
        }else {
            System.out.println("quạt đang tắt");
        }

    }




}
