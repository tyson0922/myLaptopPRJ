package org.example;

class Rabbit{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}
class HouseRabbit extends Rabbit{
    @Override
    void move(int x, int y){
        super.move(x, y);
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100)
            this.xPos = 100;
        if (this.yPos > 100)
            this.yPos = 100;
    }
}
class MountainRabbit extends Rabbit{


}
public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();
        h.move(500, 500);
        m.move(500, 500);

        System.out.printf("집토끼 위치 : (%d, %d)\n", h.xPos, h.yPos);
        System.out.printf("산토끼 위치 : (%d, %d)\n", m.xPos, m.yPos);
    }
}
