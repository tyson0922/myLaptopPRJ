package LaptopPractice.LaptopBaekjoon;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q10699 {
    public static void main (String[] args){

        Calendar calendar = Calendar.getInstance();
        Date utcTodayTime = new Date();

        calendar.setTime(utcTodayTime);
        calendar.add(Calendar.HOUR_OF_DAY, 9);

        Date seoulTodayTime = calendar.getTime();
//
//        System.out.println(utcTodayTime);
//        System.out.println(seoulTodayTime);

        //for date format including time
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String utcTime = format.format(utcTodayTime);
        String seoulTime = format.format(seoulTodayTime);

//        System.out.println(utcTime);
        System.out.println(seoulTime);
    }
}
