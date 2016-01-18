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
    public static String rgb(final Color COLOR) {
       String hex      = COLOR.toString().replace("0x", "");
       String hexRed   = hex.substring(0, 2).toUpperCase();
       String hexGreen = hex.substring(2, 4).toUpperCase();
       String hexBlue  = hex.substring(4, 6).toUpperCase();

       String intRed   = Integer.toString(Integer.parseInt(hexRed, 16));
       String intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
       String intBlue  = Integer.toString(Integer.parseInt(hexBlue, 16));

       return String.join("", "rgb(", intRed, ", ", intGreen, ", ", intBlue, ")");
   }

    public static String web(final Color COLOR) { return COLOR.toString().replace("0x", "#").substring(0, 7); }
}
