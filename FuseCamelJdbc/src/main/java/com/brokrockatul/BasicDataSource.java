/**
 * 
 */
package com.brokrockatul;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author brock
 *
 */
public class BasicDataSource {
	@Value("driverClassName")
    public String driverClassName;

    @Value("${url}")
    public String dbUrl;

    @Value("${username}")
    public String dbUserName;

    @Value("${password}")
    public String dbPassword;
   
    public DataSource getConfig() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);

        return dataSource;
    }
}
