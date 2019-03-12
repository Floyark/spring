package com.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Formate {

    //DateFormate
    @Test
    public void dateFormate() throws InterruptedException {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("今天是yyyy年，MM月，dd日，'hh':为hh，'HH':为HH:mm分ss秒S毫秒星期E aaa");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(stringBuffer.toString());
        String datStr2=simpleDateFormat.format(new Date());
        Thread.sleep(1000);
        simpleDateFormat.applyPattern("yyyy/MM/dd HH:mm:ss.SSS");
        String datStr=simpleDateFormat.format(new Date());
        System.out.println(datStr2);
        System.out.println(datStr);
    }
    //Calendar
    @Test
    public void dataCalendar() throws ParseException {
        Calendar calendar=Calendar.getInstance();
        System.out.println("Year:"+calendar.get(Calendar.YEAR));
        System.out.println("Month:"+calendar.get(Calendar.MONTH+1));
    }
}
