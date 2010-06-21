package com.unsercorp.ubergloss.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.unsercorp.ubergloss.shared.rpc.MyService;
import com.unsercorp.ubergloss.shared.rpc.MyServiceAsync;

public class UberGloss implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MyServiceAsync myService = (MyServiceAsync) GWT.create(MyService.class);
		
		myService.sayHello( new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				Window.alert(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}

}
