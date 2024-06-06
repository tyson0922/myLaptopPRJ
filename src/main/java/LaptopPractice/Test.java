package LaptopPractice;
class Rabbit2{
    String shape;
    int xPos, yPos;
    static int count;
    static int zPos;
    Rabbit2(){
        count++;

    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("객체 생성 전 토끼 수 : " + Rabbit2.count);
        Rabbit2 r2 = new Rabbit2();
        System.out.println("객체 생성 후 토끼 수 : " + r2.count);
        Rabbit2 r3 = new Rabbit2();
        System.out.println("객체 생성 후 토끼 수 : " + Rabbit2.count);
        System.out.println("객체 생성 후 토끼 수 : " + r3.count);
    }
}
