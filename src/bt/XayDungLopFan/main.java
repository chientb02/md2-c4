package bt.XayDungLopFan;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đối tượng");
        int index = scanner.nextInt();
        if (index == 1 ) {
            fan.setSpeed(Fan.FAST);
            fan.setRadius(10);
            fan.setColor("yellow");
            fan.setOn(true);
            fan.toString1();
        }else if(index ==2) {
            fan.setSpeed(Fan.MEDIUM);
            fan.setRadius(5);
            fan.setColor("blue");
            fan.setOn(false);
            fan.toString1();
        }
    }
}
