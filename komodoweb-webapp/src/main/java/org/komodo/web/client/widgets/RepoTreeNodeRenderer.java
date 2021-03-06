package org.komodo.web.client.widgets;

import org.komodo.web.client.utils.UiUtils;
import org.komodo.web.share.beans.KomodoObjectBean;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class RepoTreeNodeRenderer extends HorizontalPanel {

	public RepoTreeNodeRenderer(KomodoObjectBean kObj) {
		super();
		init(kObj);
	}
	
	private void init(KomodoObjectBean kObj) {
		
		int objType = kObj.getType();
		boolean isVirtual = kObj.isVirtual();
				
		Image theImage = UiUtils.getImage(objType,isVirtual);
		// Add the type image
		add(theImage);
		
		add(new Label(kObj.getName()));
	}
}
