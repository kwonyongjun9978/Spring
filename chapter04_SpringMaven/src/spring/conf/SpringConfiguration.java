package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//SpringConfiguration은 일반 java파일이 아니다
//applicationContext.xml와 같은 환경설정 파일이다.
@Configuration
@PropertySource("classpath:spring/db.properties")
public class SpringConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
		
//		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
//		basicDataSource.setUsername("c##java");
//		basicDataSource.setPassword("1234");
		
		basicDataSource.setDriverClassName(driver);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		return basicDataSource;
	}
}

