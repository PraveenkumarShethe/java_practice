package com.praveen.shethe.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Praveenkumar on 9/9/2021.
 */
public class DataSampling {

    public static void main(String[] args) throws ParseException {
        String data = "2021-01-01T00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(data);
        String formattedTime = output.format(d);
        System.out.println(formattedTime);

        /*System.out.println(data.length());
        System.out.println(data.substring(0, data.length()-9));
        String substring = data.substring(0, data.length() - 9);
        System.out.println(new Date(Long.parseLong(substring)));*/
    }

}
