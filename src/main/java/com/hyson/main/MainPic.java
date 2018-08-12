package com.hyson.main;

import com.hyson.util.PicUtil;
import com.hyson.vo.Point;

import java.net.URL;
import java.util.List;


/**
 * Created by hyson 2018/8/12 11:09 AM
 */
public class MainPic {
    public static void main(String[] args) throws Exception {
//        int x = 0;
//        x = getScreenPixel(100, 345);
//        System.out.println(x + " - ");
        URL url = MainPic.class.getClassLoader().getResource("pic/axH1-hhhczfc1335110.jpg");
        System.out.println(url.getPath());
        List<Point> points = PicUtil.getImagePixel(url.getPath());
        points.forEach(p ->
                System.out.println(p)
        );

    }
}
