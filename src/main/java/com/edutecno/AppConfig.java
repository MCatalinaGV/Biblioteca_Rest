package com.edutecno;
import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("com.edutecno")
public class AppConfig {

	
			@Autowired
			Environment environment;
			
			@Bean
			DataSource datasource() {
		
				DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
				driverManagerDataSource.setUrl(environment.getProperty("url"));
				driverManagerDataSource.setUsername(environment.getProperty("usuario"));
				driverManagerDataSource.setPassword(environment.getProperty("clave"));
				
				driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
				
				return driverManagerDataSource;
			}
}
