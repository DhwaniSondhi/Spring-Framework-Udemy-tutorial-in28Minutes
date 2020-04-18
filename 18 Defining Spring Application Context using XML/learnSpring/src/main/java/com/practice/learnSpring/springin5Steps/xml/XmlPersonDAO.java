package com.practice.learnSpring.springin5Steps.xml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class XmlPersonDAO {

	XmlJdbcConnection xmlJdbcconnect;

	public XmlJdbcConnection getXmlJdbcconnect() {
		return xmlJdbcconnect;
	}

	public void setXmlJdbcconnect(XmlJdbcConnection xmlJdbcconnect) {
		this.xmlJdbcconnect = xmlJdbcconnect;
	}
	
}
