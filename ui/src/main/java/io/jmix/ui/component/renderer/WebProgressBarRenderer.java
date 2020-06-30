/*
 * Copyright 2019 Haulmont.
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

package io.jmix.ui.component.renderer;

import io.jmix.core.Entity;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.component.impl.WebAbstractDataGrid;
import io.jmix.ui.widget.renderer.JmixProgressBarRenderer;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * A renderer that represents a double values as a graphical progress bar.
 */
@Component(DataGrid.ProgressBarRenderer.NAME)
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class WebProgressBarRenderer
        extends WebAbstractDataGrid.AbstractRenderer<Entity, Double>
        implements DataGrid.ProgressBarRenderer {

    @Override
    protected JmixProgressBarRenderer createImplementation() {
        return new JmixProgressBarRenderer();
    }
}
