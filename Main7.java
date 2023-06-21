      import java.util.Scanner;

    public class Main7 {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int a=in.nextInt();
            int b=in.nextInt();

            Vehicle7 v=new Vehicle7();
            v.run();

            Bike7 bi=new Bike7();
            bi.speed=a;
            bi.run();

            Car7 c=new Car7();
            c.speed=b;
            c.run();


        }
}
