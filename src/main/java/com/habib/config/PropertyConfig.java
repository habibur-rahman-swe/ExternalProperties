package com.habib.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.habib.examplebeans.FakeDataSource;
import com.habib.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({ "classpath:datasource.properties", "classpath:jms.properties" })
//@PropertySources({ 
//	@PropertySource("classpath:datasource.properties"),
//	@PropertySource("classpath:jms.properties") 	
//})
public class PropertyConfig {

	@Value("${habib.user}")
	String user;

	@Value("${habib.password}")
	String password;

	@Value("${habib.url}")
	String url;

	@Value("${habib.jms.username}")
	String jmsUsername;

	@Value("${habib.jms.password}")
	String jmsPassword;

	@Value("${habib.jms.url}")
	String jmsURL;

	@Bean
	FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();

		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);

		return fakeDataSource;
	}

	@Bean
	FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUsername(jmsUsername);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsURL);
		return fakeJmsBroker;
	}

}
