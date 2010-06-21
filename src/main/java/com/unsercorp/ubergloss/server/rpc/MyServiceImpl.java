package com.unsercorp.ubergloss.server.rpc;

import com.unsercorp.ubergloss.shared.rpc.MyService;

public class MyServiceImpl implements MyService {

	@Override
	public String sayHello() {
		return "Hello";
	}
}