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
public enum Social {
    FACEBOOK(59,89,153),
    TWITTER(85,172,238),
    LINKED_IN(0,119,181),
    TUMBLR(52,70,93),
    YAHOO(65,0,147),
    INSTAGRAM(63,114,155),
    SKYPE(0,175,240),
    WORDPRESS(33,117,155),
    VIMEO(26,183,234),
    VK(76,117,163),
    SLIDE_SHARE(0,119,181),
    GOOGLE_PLUS(220,78,65),
    PINTEREST(189,8,28),
    YOUTUBE(229,45,39),
    STUMBLE_UPON(235,73,36),
    REDDIT(255,87,0),
    QUORA(185,43,39),
    WEIBO(223,32,41),
    PRODUCT_HUNT(218,85,47),
    HACKER_NEWS(255,102,0),
    WHATS_APP(37,211,102),
    WE_CHAT(9,184,62),
    MEDIUM(2,184,117),
    VINE(0,180,137),
    SLACK(58,175,133),
    DRIBBLE(234,76,137),
    FLICKR(255,0,132),
    FOUR_SQUARE(249,72,119),
    BEHANCE(19,20,24),
    SNAP_CHAT(255,252,0);


    public final Color COLOR;

    Social(final int R, final int G, final int B) {
        COLOR = Color.rgb(R, G, B);
    }
}
