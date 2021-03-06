/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.komodo.web.client.widgets;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.komodo.web.client.utils.UiUtils;
import org.komodo.web.share.beans.KomodoObjectBean;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

@Dependent
@Templated("./KomodoObjectPropertiesPanel.html")
public class KomodoObjectPropertiesPanel extends Composite {
    
    @Inject @DataField("label-komodoprops-name")
    protected Label labelKObjectName;
    @Inject @DataField("label-komodoprops-type")
    protected Label labelKObjectType;
    @Inject @DataField("label-komodoprops-path")
    protected Label labelKObjectPath;
    
    /**
     * Called after construction.
     */
    @PostConstruct
    protected void postConstruct() {
    	labelKObjectName.setText("Name");
    	labelKObjectType.setText("Type");
    	labelKObjectPath.setText("Path");
    }
    
    public void setKObject(KomodoObjectBean kObj) {
    	labelKObjectName.setText(kObj.getName());
    	labelKObjectType.setText(UiUtils.getTypeDisplayName(kObj.getType()));
    	labelKObjectPath.setText(kObj.getPath());
    }
    
}