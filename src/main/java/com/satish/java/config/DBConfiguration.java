/**
 * 
 */
package com.satish.java.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author satish
 *
 */
@Data
@NoArgsConstructor
@ConfigurationProperties("db")
@Configuration
public class DBConfiguration {

	String connection;
	int port;
	String host;
}
