/*
 * Copyright 2021 Haulmont.
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

package io.jmix.charts.loader;


import io.jmix.charts.component.RectangularChart;
import org.dom4j.Element;

public abstract class RectangularChartLoader<T extends RectangularChart> extends CoordinateChartLoader<T> {

    @Override
    protected void loadConfiguration(T chart, Element element) {
        super.loadConfiguration(chart, element);

        loadRectangularProperties(chart, element);
    }
}