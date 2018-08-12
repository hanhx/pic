package com.hyson.util;

import com.hyson.vo.Point;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyson 2018/8/12 11:01 AM
 */
public class PicUtil {

    public static List<Point> getImagePixel(String image) throws Exception {
        int[] rgb = new int[3];
        File file = new File(image);
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //
        List<Point> pointList = new ArrayList<>();
        int width = bi.getWidth();
        int height = bi.getHeight();
        int minx = bi.getMinX();
        int miny = bi.getMinY();
        System.out.println("width=" + width + ",height=" + height + ".");
        System.out.println("minx=" + minx + ",miniy=" + miny + ".");
        for (int i = minx; i < width; i++) {
            for (int j = miny; j < height; j++) {
                int pixel = bi.getRGB(i, j); // 下面三行代码将一个数字转换为RGB数字
                rgb[0] = (pixel & 0xff0000) >> 16;
                rgb[1] = (pixel & 0xff00) >> 8;
                rgb[2] = (pixel & 0xff);
//                System.out.println("i=" + i + ",j=" + j + ":(" + rgb[0] + ","
//                        + rgb[1] + "," + rgb[2] + ")");2
                pointList.add(Point.builder()
                        .x(i)
                        .y(j)
                        .rgb(Point.RGB
                                .builder()
                                .r(rgb[0])
                                .g(rgb[1])
                                .b(rgb[2])
                                .build())
                        .build());
            }
        }
        return pointList;
    }

}
