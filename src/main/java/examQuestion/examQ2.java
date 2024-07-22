package examQuestion;

import java.util.*;

public class examQ2 {
    public static void main(String[] args) {
        // 입력값을 저장할 ArrayList 생성
        List<Integer> q2 = new ArrayList<>(Arrays.asList(5, 3, 6, 1, 2, 4));

        // 오름차순 정렬
        Collections.sort(q2);

        // 람다식을 이용하여 출력
        q2.forEach(number -> System.out.print(number + " "));

    }
}
//
//import java.util.*;
//public class examQ2 {
//    public static void main (String[] args) {
//        int[] arr={5,3,6,1,2,4};
//        List<Integer> list=new ArrayList<>();
//        for(int a:arr){
//            list.add(a);
//        }
//        Collections.sort(list);
//        StringBuilder sb=new StringBuilder();
//        list.forEach(o->sb.append(o).append(", "));
//        sb.setLength(sb.length()-2);
//        System.out.print(sb);
//    }
//}