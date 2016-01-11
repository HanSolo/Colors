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
public enum FlatUi {
    TURQOISE(31, 188, 156),
    GREEN_SEA(26, 160, 133),
    EMERLAND(87, 214, 141),
    NEPHRITIS(39, 174, 96),
    PETER_RIVER(92, 172, 226),
    BELIZE_HOLE(83, 153, 198),
    AMETHYST(175, 122, 196),
    WISTERIA(142, 68, 173),
    SUNFLOWER(241, 196, 40),
    ORANGE(245, 175, 65),
    CARROT(245, 175, 65),
    PUMPKIN(211, 85, 25),
    ALIZARIN(234, 111, 99),
    POMEGRANATE(204, 96, 85),
    CLOUDS(239, 243, 243),
    SILVER(189, 195, 199),
    CONCRETE(149, 165, 166),
    ASBESTOS(127, 140, 141),
    WET_ASPHALT(52, 73, 94),
    MIDNIGHT_BLUE(44, 62, 80);


    public final Color COLOR;

    FlatUi(final int R, final int G, final int B) {
        COLOR = Color.rgb(R, G, B);
    }
}
