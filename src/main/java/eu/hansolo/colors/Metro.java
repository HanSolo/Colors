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
 * Created by hansolo on 11.01.16.
 */
public enum Metro {
    LIGHT_GREEN(153,180,51),
    GREEN(0,163,0),
    DARK_GREEN(30,113,69),
    MAGENTA(255,0,151),
    LIGHT_PURPLE(159,0,167),
    PURPLE(126,56,120),
    DARK_PURPLE(96,60,186),
    DARKEN(29,29,29),
    TEAL(0,171,169),
    LIGHT_BLUE(239,244,255),
    BLUE(45,137,239),
    DARK_BLUE(43,87,151),
    YELLOW(255,196,13),
    ORANGE(227,162,26),
    DARK_ORANGE(218,83,44),
    RED(238,17,17),
    DARK_RED(185,29,71);


    public final Color COLOR;

    Metro(final int R, final int G, final int B) {
        COLOR = Color.rgb(R, G, B);
    }
}
