package com.practice.learnSpring.springin5Steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XmlJdbcConnection {

	public XmlJdbcConnection() {
		System.out.print("JDBC Connection");
	}
}
