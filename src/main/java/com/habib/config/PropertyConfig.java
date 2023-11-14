package com.habib.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.habib.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
	@Value("${habib.user}")
	String user;
	@Value("${habib.password}")
	String password;
	@Value("${habib.url}")                  
	String url;

	@Bean
	FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean
	static PropertySourcesPlaceholderConfigurer properties() {

		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();

		return placeholderConfigurer;
	}

}
