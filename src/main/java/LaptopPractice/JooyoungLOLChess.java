package LaptopPractice;
import java.lang.Override;
class Sasin {
    int hp;
    String item;
    void setChampion(int hp, String item){
        this.hp = hp;
        this.item = item;
    }
}
class Yone extends Sasin{
    @Override
    void setChampion(int hp, String item){
        super.setChampion(hp, item);
        this.item = "찬란한" +item;
    }
}
public class JooyoungLOLChess {
    public static void main(String[] args) {
        Yone yone3star = new Yone();
        yone3star.setChampion(1000,"거인의 결의");
        System.out.println(yone3star.item + " " + yone3star.hp);
    }
}
