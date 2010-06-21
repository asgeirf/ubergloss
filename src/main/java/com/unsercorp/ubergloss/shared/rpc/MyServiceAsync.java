package com.unsercorp.ubergloss.shared.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MyServiceAsync {

	void sayHello(AsyncCallback<String> callback);

}
