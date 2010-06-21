package com.unsercorp.ubergloss.server;

import com.google.inject.servlet.ServletModule;
import com.unsercorp.ubergloss.server.rpc.MyServiceImpl;
import com.unsercorp.ubergloss.shared.rpc.MyService;

public class UberGlossServletModule extends ServletModule {

	@Override
    protected void configureServlets() {
        serve("*.rpc").with(GuiceRemoteServiceServlet.class);

        bind(MyService.class).to(MyServiceImpl.class);
    }
}