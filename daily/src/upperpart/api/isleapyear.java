package upperpart.api;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class isleapyear {
    static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year,0,1);
        Calendar cal1 = Calendar.getInstance();
        cal1.set(year+1,0,1);
        long time1 = cal.getTimeInMillis();
        long time2 = cal1.getTimeInMillis();
        long diffMs = Math.abs(time2-time1);
        long dayDiff = diffMs/1000/60/60/24;
        if(dayDiff == 366){
            System.out.println("闰年");
        }
        else if(dayDiff==365){
            System.out.println("平年");
        }
        else {
            System.out.println("计算出错");
        }

        //jdk7
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        //月份的范围:0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号?
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2001, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());

    }
}
