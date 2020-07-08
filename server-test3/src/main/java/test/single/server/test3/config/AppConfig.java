package test.single.server.test3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.single.server.test3.App3Server;

@Configuration
@ComponentScan(basePackageClasses= App3Server.class)
public class AppConfig {
}
