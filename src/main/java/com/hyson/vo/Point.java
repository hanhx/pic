package com.hyson.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hyson 2018/8/12 11:23 AM
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Point {
    private int x;
    private int y;
    private RGB rgb;


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RGB {
        /**
         * red
         */
        private int r;
        /**
         * green
         */
        private int g;
        /**
         * blue
         */
        private int b;
    }
}
