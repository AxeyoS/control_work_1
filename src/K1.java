import java.util.Scanner;
class CalcDis {
    double dis;
    CalcDis(int x1,int y1,int x2,int y2){
        dis = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
}
public class K1 {
    public static double dis(int x1,int y1,int x2,int y2){
        return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
    public static void main(String args[]) {
        int x1, x2, y1, y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите x1: ");
        x1=sc.nextInt();
        System.out.println("Введите y1: ");
        y1=sc.nextInt();
        System.out.println("Введите x2: ");
        x2=sc.nextInt();
        System.out.println("Введите y2: ");
        y2=sc.nextInt();
        CalcDis distance=new CalcDis(x1,y1,x2,y2);
        System.out.println("Расстояние между ними "+"("+x1+","+y1+"),"+"("+x2+","+y2+") -> "+distance.dis);
    }
}