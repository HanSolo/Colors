/*
 * Copyright (c) 2016 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.hansolo.colors;

import javafx.scene.paint.Color;

/**
 *
 * Created by Naoghuman on 12.01.16.
 */
public class ColorHelper {
    
    private static String hexRed;
    private static String hexGreen;
    private static String hexBlue;
    private static String intRed;
    private static String intGreen;
    private static String intBlue;

   public static String rgb(Color color) {
       convert(color);
       
       final StringBuilder sb = new StringBuilder();
       sb.append("rgb(");
       sb.append(intRed);
       sb.append(", ");
       sb.append(intGreen);
       sb.append(", ");
       sb.append(intBlue);
       sb.append(")");

       return sb.toString();
   }

   public static String web(Color color) {
       convert(color);
       
       final StringBuilder sb = new StringBuilder();
       sb.append("#");
       sb.append(hexRed);
       sb.append(hexGreen);
       sb.append(hexBlue);

       return sb.toString();
   }
   
   private static void convert(Color color) {
        final String hex = color.toString().replace("0x", "");
        hexRed   = hex.substring(0, 2).toUpperCase();
        hexGreen = hex.substring(2, 4).toUpperCase();
        hexBlue  = hex.substring(4, 6).toUpperCase();

        intRed   = Integer.toString(Integer.parseInt(hexRed, 16));
        intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
        intBlue  = Integer.toString(Integer.parseInt(hexBlue, 16));
    }

}
