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
package org.komodo.web.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;

public interface AppCss extends ClientBundle {

	@NotStrict
    @Source("css/CustomToggle.css")
    CssResource customToggleStyle();

	@NotStrict
    @Source("css/DataGrid.css")
    CssResource customDataGridStyle();

	@NotStrict
    @Source("css/komodoweb.css")
    CssResource komodoWebStyle();
	
	@NotStrict
    @Source("css/rcue.css")
    CssResource rcueStyle();

}