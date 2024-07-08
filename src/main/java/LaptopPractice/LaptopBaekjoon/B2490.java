package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class B2490 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[4];
        char [] arr2 = new char[3];


        for(int k=0; k<3; k++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                arr[i] = s.nextInt();
                if(arr[i]==1){
                    count++;
                }
            }switch(count){
                case 0 : arr2[k] = 'D'; break;
                case 1 : arr2[k] = 'C'; break;
                case 2 : arr2[k] = 'B'; break;
                case 3 : arr2[k] = 'A'; break;
                case 4 : arr2[k] = 'E'; break;
            }
        }

        for(int i=0; i<3; i++){
            System.out.println(arr2[i]);
        }
    }
}
