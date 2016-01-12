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
public interface IColor {

    /**
     * Returns the corresponding JavaFX color.
     * 
     * @return the corresponding JavaFX color.
     */
    public Color get();

    /**
     * Returns a String expression from the color with the format: rgb(12, 121, 15)
     * 
     * @return the String expression.
     */
    public String rgb();

    /**
     * Returns a String expression from the color with the format: #AB12CD
     * 
     * @return the String expression.
     */
    public String web();
}
