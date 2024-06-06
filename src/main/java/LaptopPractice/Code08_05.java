package LaptopPractice;


class Rabbit{
    private String shape;
    int xPos, yPos;

    private void move (int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit1 extends Rabbit {
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹었습니다.");
    }
}

public class Code08_05 {
    public static void main(String [] args) {
        HouseRabbit1 hRabbit = new HouseRabbit1();

        hRabbit.owner = "난생이";
        hRabbit.eatFeed();
//        hRabbit.shape = "삼각형";
//        hRabbit.move = "(100, 100)";
    }

}
