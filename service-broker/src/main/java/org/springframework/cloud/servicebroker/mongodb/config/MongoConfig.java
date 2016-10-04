package org.springframework.cloud.servicebroker.mongodb.config;

import java.net.UnknownHostException;
import java.util.Arrays;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "org.springframework.cloud.servicebroker.mongodb.repository")
public class MongoConfig {

	//@Value("${mongodb.host:54.165.221.248}")
	@Value("${MONGODB_HOST}")
	private String host;

	//@Value("${mongodb.port:27017}")
	@Value("${MONGODB_PORT}")
	private int port;

	//@Value("${mongodb.username:admin}")
	@Value("${MONGODB_USERNAME}")
	private String username;

	//@Value("${mongodb.password:password}")
	@Value("${MONGODB_PASSWORD}")
	private String password;

	//@Value("${mongodb.database:admin}")
	@Value("${MONGODB_DATABASE}")
	private String database;



	@Bean
	public MongoClient mongoClient() throws UnknownHostException {
		MongoCredential credentialsList = MongoCredential.createCredential(username,database,password.toCharArray());
		return new MongoClient(new ServerAddress(host, port),Arrays.asList(credentialsList));

	}
	
}
