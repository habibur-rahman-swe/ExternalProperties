package com.habib.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.habib.examplebeans.FakeDataSource;
import com.habib.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({ "classpath:datasource.properties", "classpath:jms.properties" })
@PropertySources({ 
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties") 	
})
public class PropertyConfig {

	@Autowired
	Environment env;

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

		fakeDataSource.setUser(env.getProperty("USERNAME"));
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

	@Bean
	static PropertySourcesPlaceholderConfigurer properties() {

		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();

		return placeholderConfigurer;
	}

}
