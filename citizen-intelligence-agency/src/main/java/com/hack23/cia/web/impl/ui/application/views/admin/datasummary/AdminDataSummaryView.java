/*
 * Copyright 2014 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.web.impl.ui.application.views.admin.datasummary;

import java.util.concurrent.Future;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hack23.cia.service.api.ApplicationManager;
import com.hack23.cia.service.api.action.admin.RefreshDataViewsRequest;
import com.hack23.cia.service.api.action.admin.RefreshDataViewsResponse;
import com.hack23.cia.service.api.action.common.ServiceResponse;
import com.hack23.cia.service.api.action.common.ServiceResponse.ServiceResult;
import com.hack23.cia.web.impl.ui.application.views.admin.common.AbstractAdminView;
import com.hack23.cia.web.impl.ui.application.views.common.tablefactory.TableFactory;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.AdminViews;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import ru.xpoft.vaadin.VaadinView;

/**
 * The Class AdminDataSummaryView.
 */
@Service
@Scope("prototype")
@VaadinView(AdminDataSummaryView.NAME)
public final class AdminDataSummaryView extends AbstractAdminView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Constant NAME. */
	public static final String NAME = AdminViews.ADMIN_DATA_SUMMARY_VIEW_NAME;

	/** The table factory. */
	@Autowired
	private transient TableFactory tableFactory;

	/** The content. */
	private final VerticalLayout content = new VerticalLayout();

	/** The application manager. */
	@Autowired
	@Qualifier("ApplicationManager")
	private transient ApplicationManager applicationManager;


	/**
	 * Post construct.
	 */
	@PostConstruct
	public void postConstruct() {
		final Label label = new Label("Admin");
		content.addComponent(label);

		content.addComponent(tableFactory.createDataSummaryTable());

		content.setSizeFull();
		content.setMargin(false);
		content.setSpacing(true);

		Button refreshViewsButton = new Button("Refresh Views");

		refreshViewsButton.addClickListener(event -> {
			applicationManager.asyncService(new RefreshDataViewsRequest());
			Notification.show("Refresh Views Started");
		});

		content.addComponent(refreshViewsButton);

		content.addComponent(pageLinkFactory.createMainViewPageLink());

		setContent(content);

	}

	/* (non-Javadoc)
	 * @see com.vaadin.navigator.View#enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent)
	 */
	@Override
	public void enter(final ViewChangeEvent event) {
	}

}
